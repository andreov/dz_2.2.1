class AudioAttachment : Attachment {
    override val type: String
        get() = "audio"
    override val typeMedia: Audio
        get() = Audio(1, 1, 1, 1,"oooo.mp3","lllll","hhhhhhh")
}