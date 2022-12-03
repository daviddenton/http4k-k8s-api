package http4k.k8s.model.io.k8s.api.core.v1

data class TypedLocalObjectReference(
    val apiGroup: String?,
    val kind: String,
    val name: String
)
