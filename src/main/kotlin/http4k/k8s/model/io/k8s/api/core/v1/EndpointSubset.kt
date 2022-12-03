package http4k.k8s.model.io.k8s.api.core.v1

data class EndpointSubset(
    val addresses: List<EndpointAddress>?,
    val notReadyAddresses: List<EndpointAddress>?,
    val ports: List<EndpointPort>?
)
