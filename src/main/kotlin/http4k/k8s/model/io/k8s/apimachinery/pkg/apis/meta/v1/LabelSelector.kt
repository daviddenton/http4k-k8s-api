package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class LabelSelector(
	val matchExpressions: List<LabelSelectorRequirement>?,
	val matchLabels: Map<String, Any>?
)
