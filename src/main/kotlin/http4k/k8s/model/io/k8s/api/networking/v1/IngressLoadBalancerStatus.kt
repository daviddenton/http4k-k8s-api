package http4k.k8s.model.io.k8s.api.networking.v1

data class IngressLoadBalancerStatus(
    val ingress: List<IngressLoadBalancerIngress>?
)
