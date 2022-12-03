package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class NodeSpec(
	val configSource: NodeConfigSource?,
	val externalID: String?,
	val podCIDR: String?,
	val podCIDRs: List<String>?,
	val providerID: String?,
	val taints: List<Taint>?,
	val unschedulable: Boolean?
)
