package http4k.k8s.model.io.k8s.api.core.v1

data class ConfigMapKeySelector(
    val key: String,
    val name: String?,
    val optional: Boolean?
)
