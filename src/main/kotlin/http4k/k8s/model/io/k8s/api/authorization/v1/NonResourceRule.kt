package http4k.k8s.model.io.k8s.api.authorization.v1

data class NonResourceRule(
    val nonResourceURLs: List<String>?,
    val verbs: List<String>
)
