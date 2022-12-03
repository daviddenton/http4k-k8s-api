package http4k.k8s.model.io.k8s.api.storage.v1

import kotlin.Int
import kotlin.String

data class TokenRequest(
	val audience: String,
	val expirationSeconds: Int?
)
