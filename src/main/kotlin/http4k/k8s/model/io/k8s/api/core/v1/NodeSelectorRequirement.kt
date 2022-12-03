package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String
import kotlin.collections.List

data class NodeSelectorRequirement(
	val key: String,
	val `operator`: String,
	val values: List<String>?
)