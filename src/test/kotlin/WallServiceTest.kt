import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20))
        service.add(post)
        service.add(post)
        val result=post.id
        assertEquals(2,result)


    }

    @Test
    fun update() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20))
        service.add(post)
        service.add(post)
        val result = service.update(post)
        assertTrue(result)
    }
}