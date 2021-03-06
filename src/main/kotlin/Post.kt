data class Post(
        var id: Long = 0,
        val idOnwer: Long = 0,
        val idAuthor: Long = 0,
        val createdBy: Long = 0,
        val datePost: Int = 0,
        val content: String = "",
        val idReplyOnwer: Long = 0,
        val idReplyPost: Long = 0,
        val frindsOnly: Boolean = false,
        //val comments: Comments?,
        val copyright: String = "",
        val likes: Likes = Likes(),
        val reports: Reports = Reports(),
        val viewsCount: Int = 0,
        val postType: String = "",
        val signerId: Long = 0,
        val canPin: Boolean = false,
        val canDelete: Boolean = false,
        val isPinned: Boolean = false,
        val markedAsAds: Boolean = false,
        val isFavorite: Boolean = false,
        val postponedId: Long = 0,
        var comments:Array<Comment> = emptyArray<Comment>(),
        var attachments: Array<Attachment> = emptyArray<Attachment>()


)