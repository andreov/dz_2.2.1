import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20),comments = null)
        service.add(post)
        service.add(post)
        val result=post.id
        assertEquals(2,result)


    }

    @Test
    fun update() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20), comments = null)
        service.add(post)
        service.add(post)
        val result = service.update(post)
        assertTrue(result)
    }

    @Test
    fun update2() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20), comments = null)
        service.add(post)
        service.add(post)
        val update = Post(id = 5, content = "asddsdasd", likes=Likes(count=30),comments = null)
        val result = service.update(update)
        assertFalse(result)
    }
}