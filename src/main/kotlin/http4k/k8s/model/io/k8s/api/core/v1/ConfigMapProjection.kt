package http4k.k8s.model.io.k8s.api.core.v1

data class ConfigMapProjection(
    val items: List<KeyToPath>?,
    val name: String?,
    val optional: Boolean?
)
