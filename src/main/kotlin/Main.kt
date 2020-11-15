

fun main() {
    val wallService = WallService()
    val audioAttachment = AudioAttachment()
    val videoAttachment = VideoAttachment()
    var post = Post(content = "asddsdasd", likes = Likes(count = 10))
    var post1 = Post(content = "asddsdasd", likes = Likes(count = 20))
    var post2 = Post(
        content = "asddsdasd",
        likes = Likes(count = 30),
        attachments = arrayOf(audioAttachment, videoAttachment)
    )
    wallService.add(post)
    wallService.add(post1)
    wallService.add(post2)
    var comment=Comment(3,text="1111111")
    var comment2=Comment(3, text = "2222222")
    var comment3=Comment(3, text = "333333")
    var comment4=Comment(4, text = "4444444")

    wallService.newComment(comment)
    wallService.newComment(comment2)
    wallService.newComment(comment3)
    //wallService.newComment(comment4)
    println(wallService.posts.last())
    println(wallService.posts.contentToString())
}
