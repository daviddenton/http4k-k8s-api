package http4k.k8s.model.io.k8s.api.authorization.v1

data class SubjectAccessReviewSpec(
    val extra: Map<String, Any>?,
    val groups: List<String>?,
    val nonResourceAttributes: NonResourceAttributes?,
    val resourceAttributes: ResourceAttributes?,
    val uid: String?,
    val user: String?
)
