package http4k.k8s.model.io.k8s.api.certificates.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.String

data class CertificateSigningRequestCondition(
	val lastTransitionTime: Time?,
	val lastUpdateTime: Time?,
	val message: String?,
	val reason: String?,
	val status: String,
	val type: String
)
