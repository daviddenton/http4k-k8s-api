package http4k.k8s.model.io.k8s.api.core.v1

data class TopologySelectorLabelRequirement(
    val key: String,
    val values: List<String>
)
