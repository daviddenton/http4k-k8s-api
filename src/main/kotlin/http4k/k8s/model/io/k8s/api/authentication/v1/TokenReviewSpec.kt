package http4k.k8s.model.io.k8s.api.authentication.v1

data class TokenReviewSpec(
    val audiences: List<String>?,
    val token: String?
)
