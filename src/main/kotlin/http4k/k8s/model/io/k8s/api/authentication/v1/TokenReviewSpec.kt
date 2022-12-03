package http4k.k8s.model.io.k8s.api.authentication.v1

import kotlin.String
import kotlin.collections.List

data class TokenReviewSpec(
	val audiences: List<String>?,
	val token: String?
)
