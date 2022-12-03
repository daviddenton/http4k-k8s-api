package http4k.k8s.model.io.k8s.api.discovery.v1

data class EndpointPort(
    val appProtocol: String?,
    val name: String?,
    val port: Int?,
    val protocol: String?
)
