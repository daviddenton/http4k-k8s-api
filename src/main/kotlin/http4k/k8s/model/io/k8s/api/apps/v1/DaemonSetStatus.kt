package http4k.k8s.model.io.k8s.api.apps.v1

import kotlin.Int
import kotlin.collections.List

data class DaemonSetStatus(
	val collisionCount: Int?,
	val conditions: List<DaemonSetCondition>?,
	val currentNumberScheduled: Int,
	val desiredNumberScheduled: Int,
	val numberAvailable: Int?,
	val numberMisscheduled: Int,
	val numberReady: Int,
	val numberUnavailable: Int?,
	val observedGeneration: Int?,
	val updatedNumberScheduled: Int?
)
