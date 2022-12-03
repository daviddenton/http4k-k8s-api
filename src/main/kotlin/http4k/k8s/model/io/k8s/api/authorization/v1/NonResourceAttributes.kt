package http4k.k8s.model.io.k8s.api.authorization.v1

import kotlin.String

data class NonResourceAttributes(
	val path: String?,
	val verb: String?
)
