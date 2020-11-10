class VideoAttachment : Attachment {
    override val type: String
        get() = "video"
    override val typeMedia: Video
        get() = Video(1, 1, 1, 1,"oooo.mp3","lllll","hhhhhhh")
}