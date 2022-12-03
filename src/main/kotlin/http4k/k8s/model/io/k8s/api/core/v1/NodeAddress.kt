package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class NodeAddress(
	val address: String,
	val type: String
)
