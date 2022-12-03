package http4k.k8s.model.io.k8s.api.authorization.v1

data class SubjectAccessReviewStatus(
    val allowed: Boolean,
    val denied: Boolean?,
    val evaluationError: String?,
    val reason: String?
)
