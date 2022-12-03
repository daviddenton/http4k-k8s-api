package http4k.k8s.model.io.k8s.api.authorization.v1

data class NonResourceAttributes(
    val path: String?,
    val verb: String?
)
