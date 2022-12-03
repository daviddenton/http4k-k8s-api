package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class Ingress(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: IngressSpec?,
    val status: IngressStatus?
)
