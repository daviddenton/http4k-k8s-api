package http4k.k8s.model.io.k8s.api.authentication.v1

data class TokenReviewStatus(
    val audiences: List<String>?,
    val authenticated: Boolean?,
    val error: String?,
    val user: UserInfo?
)
