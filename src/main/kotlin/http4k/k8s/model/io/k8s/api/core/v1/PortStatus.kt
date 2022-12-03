package http4k.k8s.model.io.k8s.api.core.v1

data class PortStatus(
    val error: String?,
    val port: Int,
    val protocol: String
)
