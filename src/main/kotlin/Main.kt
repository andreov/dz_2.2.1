fun main() {
    var post=Post(content = "asddsdasd", likes=Likes(count=20))
    println(post.likes)
    println(post.comments)
    println(post.reports)
    println(post.content)
}