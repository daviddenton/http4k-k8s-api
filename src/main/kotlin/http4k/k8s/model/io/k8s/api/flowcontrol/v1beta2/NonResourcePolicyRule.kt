package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import kotlin.String
import kotlin.collections.List

data class NonResourcePolicyRule(
	val nonResourceURLs: List<String>,
	val verbs: List<String>
)
