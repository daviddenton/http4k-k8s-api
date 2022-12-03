package http4k.k8s.model.io.k8s.api.core.v1

data class AzureDiskVolumeSource(
    val cachingMode: String?,
    val diskName: String,
    val diskURI: String,
    val fsType: String?,
    val kind: String?,
    val readOnly: Boolean?
)
