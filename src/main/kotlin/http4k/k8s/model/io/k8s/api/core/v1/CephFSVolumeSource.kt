package http4k.k8s.model.io.k8s.api.core.v1

data class CephFSVolumeSource(
    val monitors: List<String>,
    val path: String?,
    val readOnly: Boolean?,
    val secretFile: String?,
    val secretRef: LocalObjectReference?,
    val user: String?
)
