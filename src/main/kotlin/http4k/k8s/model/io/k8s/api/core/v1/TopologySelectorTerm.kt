package http4k.k8s.model.io.k8s.api.core.v1

data class TopologySelectorTerm(
    val matchLabelExpressions: List<TopologySelectorLabelRequirement>?
)
