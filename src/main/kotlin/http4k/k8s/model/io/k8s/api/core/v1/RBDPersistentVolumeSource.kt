package http4k.k8s.model.io.k8s.api.core.v1

data class RBDPersistentVolumeSource(
    val fsType: String?,
    val image: String,
    val keyring: String?,
    val monitors: List<String>,
    val pool: String?,
    val readOnly: Boolean?,
    val secretRef: SecretReference?,
    val user: String?
)
