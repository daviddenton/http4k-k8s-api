package http4k.k8s.model.io.k8s.api.core.v1

data class NodeSelectorTerm(
    val matchExpressions: List<NodeSelectorRequirement>?,
    val matchFields: List<NodeSelectorRequirement>?
)
