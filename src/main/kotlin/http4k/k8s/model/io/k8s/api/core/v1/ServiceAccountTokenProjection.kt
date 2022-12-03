package http4k.k8s.model.io.k8s.api.core.v1

data class ServiceAccountTokenProjection(
    val audience: String?,
    val expirationSeconds: Int?,
    val path: String
)
