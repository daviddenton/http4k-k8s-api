package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.Map

data class ResourceQuotaStatus(
	val hard: Map<String, Any>?,
	val used: Map<String, Any>?
)
