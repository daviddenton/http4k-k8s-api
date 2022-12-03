package http4k.k8s.model.io.k8s.api.core.v1

data class RBDVolumeSource(
    val fsType: String?,
    val image: String,
    val keyring: String?,
    val monitors: List<String>,
    val pool: String?,
    val readOnly: Boolean?,
    val secretRef: LocalObjectReference?,
    val user: String?
)
