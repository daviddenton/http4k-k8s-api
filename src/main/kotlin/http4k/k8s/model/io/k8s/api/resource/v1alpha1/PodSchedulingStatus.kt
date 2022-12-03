package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import kotlin.collections.List

data class PodSchedulingStatus(
	val resourceClaims: List<ResourceClaimSchedulingStatus>?
)
