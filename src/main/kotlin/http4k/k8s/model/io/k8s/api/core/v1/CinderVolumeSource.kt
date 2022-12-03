package http4k.k8s.model.io.k8s.api.core.v1

data class CinderVolumeSource(
    val fsType: String?,
    val readOnly: Boolean?,
    val secretRef: LocalObjectReference?,
    val volumeID: String
)
