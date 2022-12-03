package http4k.k8s.model.io.k8s.api.certificates.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class CertificateSigningRequestList(
    val apiVersion: String?,
    val items: List<CertificateSigningRequest>,
    val kind: String?,
    val metadata: ListMeta?
)
