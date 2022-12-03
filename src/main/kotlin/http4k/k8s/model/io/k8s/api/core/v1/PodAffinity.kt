package http4k.k8s.model.io.k8s.api.core.v1

data class PodAffinity(
    val preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm>?,
    val requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm>?
)
