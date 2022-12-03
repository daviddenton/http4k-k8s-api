package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int

data class WeightedPodAffinityTerm(
	val podAffinityTerm: PodAffinityTerm,
	val weight: Int
)
