package http4k.k8s.model.io.k8s.api.storage.v1

data class TokenRequest(
    val audience: String,
    val expirationSeconds: Int?
)
