package http4k.k8s.model.io.k8s.api.authorization.v1

import kotlin.String
import kotlin.collections.List

data class ResourceRule(
	val apiGroups: List<String>?,
	val resourceNames: List<String>?,
	val resources: List<String>?,
	val verbs: List<String>
)
