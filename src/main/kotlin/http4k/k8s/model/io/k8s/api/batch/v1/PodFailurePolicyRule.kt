package http4k.k8s.model.io.k8s.api.batch.v1

import kotlin.String
import kotlin.collections.List

data class PodFailurePolicyRule(
	val action: String,
	val onExitCodes: PodFailurePolicyOnExitCodesRequirement?,
	val onPodConditions: List<PodFailurePolicyOnPodConditionsPattern>
)
