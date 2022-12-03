package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import http4k.k8s.model.io.k8s.api.core.v1.NodeSelector
import kotlin.Boolean
import kotlin.String

data class AllocationResult(
	val availableOnNodes: NodeSelector?,
	val resourceHandle: String?,
	val shareable: Boolean?
)
