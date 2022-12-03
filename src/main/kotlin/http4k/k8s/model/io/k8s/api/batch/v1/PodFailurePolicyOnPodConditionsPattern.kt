package http4k.k8s.model.io.k8s.api.batch.v1

import kotlin.String

data class PodFailurePolicyOnPodConditionsPattern(
	val status: String,
	val type: String
)
