package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import kotlin.String
import kotlin.collections.List

data class ResourceClaimSchedulingStatus(
	val name: String?,
	val unsuitableNodes: List<String>?
)
