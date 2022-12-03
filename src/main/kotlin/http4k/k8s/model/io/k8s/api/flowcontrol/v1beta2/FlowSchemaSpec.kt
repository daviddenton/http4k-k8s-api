package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import kotlin.Int
import kotlin.collections.List

data class FlowSchemaSpec(
	val distinguisherMethod: FlowDistinguisherMethod?,
	val matchingPrecedence: Int?,
	val priorityLevelConfiguration: PriorityLevelConfigurationReference,
	val rules: List<PolicyRulesWithSubjects>?
)
