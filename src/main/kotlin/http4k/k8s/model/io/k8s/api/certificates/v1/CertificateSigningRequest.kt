package http4k.k8s.model.io.k8s.api.certificates.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class CertificateSigningRequest(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: CertificateSigningRequestSpec,
    val status: CertificateSigningRequestStatus?
)
