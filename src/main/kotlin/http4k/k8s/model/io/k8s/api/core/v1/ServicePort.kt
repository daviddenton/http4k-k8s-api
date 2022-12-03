package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString

data class ServicePort(
    val appProtocol: String?,
    val name: String?,
    val nodePort: Int?,
    val port: Int,
    val protocol: String?,
    val targetPort: IntOrString?
)
