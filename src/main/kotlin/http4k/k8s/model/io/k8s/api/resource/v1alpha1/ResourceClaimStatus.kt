package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class ResourceClaimStatus(
	val allocation: AllocationResult?,
	val deallocationRequested: Boolean?,
	val driverName: String?,
	val reservedFor: List<ResourceClaimConsumerReference>?
)
