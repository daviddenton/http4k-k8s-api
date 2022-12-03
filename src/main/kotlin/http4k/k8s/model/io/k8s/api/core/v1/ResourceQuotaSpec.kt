package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class ResourceQuotaSpec(
	val hard: Map<String, Any>?,
	val scopeSelector: ScopeSelector?,
	val scopes: List<String>?
)
