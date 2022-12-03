package http4k.k8s.model.io.k8s.api.node.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

data class Overhead(
	val podFixed: Map<String, Any>?
)
