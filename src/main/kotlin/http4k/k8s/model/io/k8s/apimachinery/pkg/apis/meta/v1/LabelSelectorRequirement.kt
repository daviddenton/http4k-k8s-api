package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.String
import kotlin.collections.List

data class LabelSelectorRequirement(
	val key: String,
	val `operator`: String,
	val values: List<String>?
)
