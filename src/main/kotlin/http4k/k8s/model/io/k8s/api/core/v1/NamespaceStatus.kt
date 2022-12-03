package http4k.k8s.model.io.k8s.api.core.v1

data class NamespaceStatus(
    val conditions: List<NamespaceCondition>?,
    val phase: String?
)
