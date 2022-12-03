package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Condition

data class NetworkPolicyStatus(
    val conditions: List<Condition>?
)
