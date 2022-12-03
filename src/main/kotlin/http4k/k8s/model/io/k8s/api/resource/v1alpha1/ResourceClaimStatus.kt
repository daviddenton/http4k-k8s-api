package http4k.k8s.model.io.k8s.api.resource.v1alpha1

data class ResourceClaimStatus(
    val allocation: AllocationResult?,
    val deallocationRequested: Boolean?,
    val driverName: String?,
    val reservedFor: List<ResourceClaimConsumerReference>?
)
