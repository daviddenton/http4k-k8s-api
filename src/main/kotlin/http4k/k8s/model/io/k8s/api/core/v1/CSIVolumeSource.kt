package http4k.k8s.model.io.k8s.api.core.v1

data class CSIVolumeSource(
    val driver: String,
    val fsType: String?,
    val nodePublishSecretRef: LocalObjectReference?,
    val readOnly: Boolean?,
    val volumeAttributes: Map<String, Any>?
)
