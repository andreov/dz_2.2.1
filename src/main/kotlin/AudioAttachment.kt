class AudioAttachment : Attachment {
    override val type: String
        get() = "Audio"
    override val typeMedia: Audio
        get() = Audio(1, 1, 1, 1)
}