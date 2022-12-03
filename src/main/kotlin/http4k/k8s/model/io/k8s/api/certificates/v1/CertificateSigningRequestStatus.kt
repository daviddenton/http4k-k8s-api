package http4k.k8s.model.io.k8s.api.certificates.v1

data class CertificateSigningRequestStatus(
    val certificate: String?,
    val conditions: List<CertificateSigningRequestCondition>?
)
