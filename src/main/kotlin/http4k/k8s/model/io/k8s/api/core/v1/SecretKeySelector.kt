package http4k.k8s.model.io.k8s.api.core.v1

data class SecretKeySelector(
    val key: String,
    val name: String?,
    val optional: Boolean?
)
