package http4k.k8s.model.io.k8s.api.batch.v1

import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class PodFailurePolicyOnExitCodesRequirement(
	val containerName: String?,
	val `operator`: String,
	val values: List<Int>
)
