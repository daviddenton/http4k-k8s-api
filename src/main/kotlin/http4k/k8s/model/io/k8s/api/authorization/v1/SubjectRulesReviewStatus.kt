package http4k.k8s.model.io.k8s.api.authorization.v1

data class SubjectRulesReviewStatus(
    val evaluationError: String?,
    val incomplete: Boolean,
    val nonResourceRules: List<NonResourceRule>,
    val resourceRules: List<ResourceRule>
)
