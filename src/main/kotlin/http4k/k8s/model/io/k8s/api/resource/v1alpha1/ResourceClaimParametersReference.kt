package http4k.k8s.model.io.k8s.api.resource.v1alpha1

data class ResourceClaimParametersReference(
    val apiGroup: String?,
    val kind: String,
    val name: String
)
