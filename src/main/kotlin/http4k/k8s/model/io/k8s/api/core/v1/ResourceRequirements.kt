package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class ResourceRequirements(
	val claims: List<ResourceClaim>?,
	val limits: Map<String, Any>?,
	val requests: Map<String, Any>?
)
