

fun main() {
    val wallService = WallService()
    val audioAttachment = AudioAttachment()
    val videoAttachment = VideoAttachment()
    var post = Post(content = "asddsdasd", likes = Likes(count = 10), comments = null)
    var post1 = Post(content = "asddsdasd", likes = Likes(count = 20), comments = null)
    var post2 = Post(
        content = "asddsdasd",
        likes = Likes(count = 30),
        comments = null,
        attachments = arrayOf(audioAttachment, videoAttachment)
    )
    wallService.add(post)
    wallService.add(post1)
    wallService.add(post2)
    wallService.newComment(3, 2, "dddddd")
    wallService.newComment(3, 2, "dddddd")
    wallService.newComment(3, 2, "dddddd")
    //wallService.newComment(4, 2, "dddddd")
    println(wallService.posts.last())
    println(wallService.posts.contentToString())
}
