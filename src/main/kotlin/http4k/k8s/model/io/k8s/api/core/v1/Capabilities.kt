package http4k.k8s.model.io.k8s.api.core.v1

data class Capabilities(
    val add: List<String>?,
    val drop: List<String>?
)
