package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString

data class TCPSocketAction(
    val host: String?,
    val port: IntOrString
)
