package http4k.k8s.model.io.k8s.api.core.v1

data class NodeAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm>?,
    val requiredDuringSchedulingIgnoredDuringExecution: NodeSelector?
)
