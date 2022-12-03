package http4k.k8s.model.io.k8s.api.core.v1

data class ConfigMapVolumeSource(
    val defaultMode: Int?,
    val items: List<KeyToPath>?,
    val name: String?,
    val optional: Boolean?
)
