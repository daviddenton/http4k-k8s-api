package http4k.k8s.model.io.k8s.api.core.v1

data class ResourceRequirements(
    val claims: List<ResourceClaim>?,
    val limits: Map<String, Any>?,
    val requests: Map<String, Any>?
)
