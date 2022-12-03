package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class LabelSelector(
    val matchExpressions: List<LabelSelectorRequirement>?,
    val matchLabels: Map<String, Any>?
)
