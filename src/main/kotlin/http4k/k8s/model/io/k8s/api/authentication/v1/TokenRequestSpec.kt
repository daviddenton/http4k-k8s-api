package http4k.k8s.model.io.k8s.api.authentication.v1

import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class TokenRequestSpec(
	val audiences: List<String>,
	val boundObjectRef: BoundObjectReference?,
	val expirationSeconds: Int?
)
