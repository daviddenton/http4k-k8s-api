package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import kotlin.String

data class PriorityLevelConfigurationSpec(
	val limited: LimitedPriorityLevelConfiguration?,
	val type: String
)