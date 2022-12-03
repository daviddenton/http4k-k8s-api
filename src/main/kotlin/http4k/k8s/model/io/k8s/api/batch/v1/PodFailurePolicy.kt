package http4k.k8s.model.io.k8s.api.batch.v1

import kotlin.collections.List

data class PodFailurePolicy(
	val rules: List<PodFailurePolicyRule>
)
