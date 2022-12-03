package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.collections.List

data class ReplicationControllerStatus(
	val availableReplicas: Int?,
	val conditions: List<ReplicationControllerCondition>?,
	val fullyLabeledReplicas: Int?,
	val observedGeneration: Int?,
	val readyReplicas: Int?,
	val replicas: Int
)
