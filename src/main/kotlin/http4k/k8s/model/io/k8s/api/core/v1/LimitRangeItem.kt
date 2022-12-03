package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

data class LimitRangeItem(
	val default: Map<String, Any>?,
	val defaultRequest: Map<String, Any>?,
	val max: Map<String, Any>?,
	val maxLimitRequestRatio: Map<String, Any>?,
	val min: Map<String, Any>?,
	val type: String
)
