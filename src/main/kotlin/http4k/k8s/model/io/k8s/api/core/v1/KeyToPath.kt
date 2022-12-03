package http4k.k8s.model.io.k8s.api.core.v1

data class KeyToPath(
    val key: String,
    val mode: Int?,
    val path: String
)
