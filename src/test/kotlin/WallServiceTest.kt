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

    @Test
    fun update2() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20))
        service.add(post)
        service.add(post)
        val update = Post(id = 5, content = "asddsdasd", likes=Likes(count=30))
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun newComment() {
        val service = WallService()
        var post=Post(content = "asddsdasd", likes=Likes(count=20))
        service.add(post)
        service.add(post)
        service.add(post)
        var comment=Comment(3,text="1111111")
        var comment2=Comment(3, text = "2222222")
        var comment3=Comment(3, text = "333333")
        service.newComment(comment)
        service.newComment(comment2)
        service.newComment(comment3)
        var result:Int= comment3.idComment
        assertEquals(3,result)
    }


    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        var comment4=Comment(4, text = "4444444")
        service.newComment(comment4)
    }
}