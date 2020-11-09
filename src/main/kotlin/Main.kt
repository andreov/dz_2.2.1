

fun main() {
    //val post2:Post
    val wallService = WallService()
    var post=Post(content = "asddsdasd", likes=Likes(count=20))
    var post1=Post(content = "asddsdasd", likes=Likes(count=20))
    var post2=Post(content = "asddsdasd", likes=Likes(count=20))
    wallService.add(post)
    wallService.add(post1)
    wallService.add(post2)
    println(wallService.update(post1))
    println(post.likes)
    println(post.reports)
    println(post.content)
    println(post2.id)
    println(wallService.posts.last())
    println(wallService.posts.size)
    println(wallService.posts.contentToString())


}