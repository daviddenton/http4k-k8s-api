package http4k.k8s.model.io.k8s.api.authentication.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.String

data class TokenRequestStatus(
	val expirationTimestamp: Time,
	val token: String
)
