package http4k.k8s.model.io.k8s.api.core.v1

data class ClaimSource(
    val resourceClaimName: String?,
    val resourceClaimTemplateName: String?
)
