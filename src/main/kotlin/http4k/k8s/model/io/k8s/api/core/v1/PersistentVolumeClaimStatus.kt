package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class PersistentVolumeClaimStatus(
	val accessModes: List<String>?,
	val allocatedResources: Map<String, Any>?,
	val capacity: Map<String, Any>?,
	val conditions: List<PersistentVolumeClaimCondition>?,
	val phase: String?,
	val resizeStatus: String?
)
