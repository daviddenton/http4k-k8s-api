package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String
import kotlin.collections.List

data class Capabilities(
	val add: List<String>?,
	val drop: List<String>?
)
