package http4k.k8s.model.io.k8s.api.core.v1

data class ComponentCondition(
    val error: String?,
    val message: String?,
    val status: String,
    val type: String
)
