package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import kotlin.collections.List

data class FlowSchemaStatus(
	val conditions: List<FlowSchemaCondition>?
)