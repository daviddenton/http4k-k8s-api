package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.String

data class IngressClassSpec(
	val controller: String?,
	val parameters: IngressClassParametersReference?
)
