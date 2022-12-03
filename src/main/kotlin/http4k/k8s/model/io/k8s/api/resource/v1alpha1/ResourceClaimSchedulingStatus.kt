package http4k.k8s.model.io.k8s.api.resource.v1alpha1

data class ResourceClaimSchedulingStatus(
    val name: String?,
    val unsuitableNodes: List<String>?
)
