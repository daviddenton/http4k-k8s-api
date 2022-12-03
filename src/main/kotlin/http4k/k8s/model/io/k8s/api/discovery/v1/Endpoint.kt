package http4k.k8s.model.io.k8s.api.discovery.v1

import http4k.k8s.model.io.k8s.api.core.v1.ObjectReference
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class Endpoint(
	val addresses: List<String>,
	val conditions: EndpointConditions?,
	val deprecatedTopology: Map<String, Any>?,
	val hints: EndpointHints?,
	val hostname: String?,
	val nodeName: String?,
	val targetRef: ObjectReference?,
	val zone: String?
)
