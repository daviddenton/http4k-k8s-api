package http4k.k8s.model.io.k8s.api.networking.v1

data class IngressPortStatus(
    val error: String?,
    val port: Int,
    val protocol: String
)
