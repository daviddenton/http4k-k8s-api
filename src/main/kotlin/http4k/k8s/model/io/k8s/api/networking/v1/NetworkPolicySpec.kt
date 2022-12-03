package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class NetworkPolicySpec(
    val egress: List<NetworkPolicyEgressRule>?,
    val ingress: List<NetworkPolicyIngressRule>?,
    val podSelector: LabelSelector,
    val policyTypes: List<String>?
)
