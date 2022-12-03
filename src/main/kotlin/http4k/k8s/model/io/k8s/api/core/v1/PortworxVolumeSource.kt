package http4k.k8s.model.io.k8s.api.core.v1

data class PortworxVolumeSource(
    val fsType: String?,
    val readOnly: Boolean?,
    val volumeID: String
)
