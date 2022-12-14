package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString

data class NetworkPolicyPort(
    val endPort: Int?,
    val port: IntOrString?,
    val protocol: String?
)
