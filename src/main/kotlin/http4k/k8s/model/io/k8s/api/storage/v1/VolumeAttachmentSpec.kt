package http4k.k8s.model.io.k8s.api.storage.v1

data class VolumeAttachmentSpec(
    val attacher: String,
    val nodeName: String,
    val source: VolumeAttachmentSource
)
