

fun main() {
    val wallService = WallService()
    val audioAttachment1 = AudioAttachment()
    val audioAttachment2 = AudioAttachment()
    var post=Post(content = "asddsdasd", likes=Likes(count=10),comments = null)
    var post1=Post(content = "asddsdasd", likes=Likes(count=20), comments = null)
    var post2=Post(content = "asddsdasd", likes=Likes(count=30),comments = null,attachments= arrayOf(audioAttachment1,audioAttachment2) )
    wallService.add(post)
    wallService.add(post1)
    wallService.add(post2)
    println(wallService.posts.last())
    println(wallService.posts.contentToString())


}