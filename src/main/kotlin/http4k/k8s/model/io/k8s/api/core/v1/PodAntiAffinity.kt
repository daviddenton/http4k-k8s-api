package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.collections.List

data class PodAntiAffinity(
	val preferredDuringSchedulingIgnoredDuringExecution: List<WeightedPodAffinityTerm>?,
	val requiredDuringSchedulingIgnoredDuringExecution: List<PodAffinityTerm>?
)
