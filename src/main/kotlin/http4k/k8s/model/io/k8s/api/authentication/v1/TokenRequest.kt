package http4k.k8s.model.io.k8s.api.authentication.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class TokenRequest(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: TokenRequestSpec,
    val status: TokenRequestStatus?
)
