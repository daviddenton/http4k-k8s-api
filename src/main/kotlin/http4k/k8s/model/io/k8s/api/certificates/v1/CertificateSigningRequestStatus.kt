package http4k.k8s.model.io.k8s.api.certificates.v1

import kotlin.String
import kotlin.collections.List

data class CertificateSigningRequestStatus(
	val certificate: String?,
	val conditions: List<CertificateSigningRequestCondition>?
)
