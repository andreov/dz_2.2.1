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

    @Test
    fun newComment() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20),comments = null)
        service.add(post)
        service.add(post)
        service.newComment(2, 2, "dddddd")
        service.newComment(2, 2, "dddddd")
        var result:CommentWrite = service.newComment(2, 2, "dddddd")
        assertEquals(3,result.idComment)
    }

    @Test(expected = IllegalStateException::class)
    fun shouldThrow() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20),comments = null)
        service.add(post)
        service.newComment(2, 2, "dddddd")
    }
}