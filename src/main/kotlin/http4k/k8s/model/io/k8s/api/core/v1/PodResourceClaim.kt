package http4k.k8s.model.io.k8s.api.core.v1

data class PodResourceClaim(
    val name: String,
    val source: ClaimSource?
)
