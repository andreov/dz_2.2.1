interface CreateComment {
    fun newComment(postId:Long, onwerId:Long,message:String):CommentWrite
}