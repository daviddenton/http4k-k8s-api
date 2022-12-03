package http4k.k8s.model.io.k8s.api.admissionregistration.v1

import kotlin.String
import kotlin.collections.List

data class RuleWithOperations(
	val apiGroups: List<String>?,
	val apiVersions: List<String>?,
	val operations: List<String>?,
	val resources: List<String>?,
	val scope: String?
)
