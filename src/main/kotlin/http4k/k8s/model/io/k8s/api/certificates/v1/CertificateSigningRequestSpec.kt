package http4k.k8s.model.io.k8s.api.certificates.v1

data class CertificateSigningRequestSpec(
    val expirationSeconds: Int?,
    val extra: Map<String, Any>?,
    val groups: List<String>?,
    val request: String,
    val signerName: String,
    val uid: String?,
    val usages: List<String>?,
    val username: String?
)
