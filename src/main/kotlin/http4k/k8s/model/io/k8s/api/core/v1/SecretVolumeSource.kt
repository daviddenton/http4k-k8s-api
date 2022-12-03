package http4k.k8s.model.io.k8s.api.core.v1

data class SecretVolumeSource(
    val defaultMode: Int?,
    val items: List<KeyToPath>?,
    val optional: Boolean?,
    val secretName: String?
)
