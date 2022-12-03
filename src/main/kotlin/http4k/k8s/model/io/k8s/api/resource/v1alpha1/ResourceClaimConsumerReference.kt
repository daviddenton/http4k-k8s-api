package http4k.k8s.model.io.k8s.api.resource.v1alpha1

data class ResourceClaimConsumerReference(
    val apiGroup: String?,
    val name: String,
    val resource: String,
    val uid: String
)
