package http4k.k8s.model.io.k8s.api.networking.v1

data class NetworkPolicyIngressRule(
    val from: List<NetworkPolicyPeer>?,
    val ports: List<NetworkPolicyPort>?
)
