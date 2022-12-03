package http4k.k8s.model.io.k8s.api.storage.v1

data class VolumeAttachmentStatus(
    val attachError: VolumeError?,
    val attached: Boolean,
    val attachmentMetadata: Map<String, Any>?,
    val detachError: VolumeError?
)
