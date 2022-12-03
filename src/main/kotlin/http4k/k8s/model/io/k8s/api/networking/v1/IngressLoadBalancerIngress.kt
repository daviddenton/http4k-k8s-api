package http4k.k8s.model.io.k8s.api.networking.v1

data class IngressLoadBalancerIngress(
    val hostname: String?,
    val ip: String?,
    val ports: List<IngressPortStatus>?
)
