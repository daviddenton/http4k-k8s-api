package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class NodeStatus(
	val addresses: List<NodeAddress>?,
	val allocatable: Map<String, Any>?,
	val capacity: Map<String, Any>?,
	val conditions: List<NodeCondition>?,
	val config: NodeConfigStatus?,
	val daemonEndpoints: NodeDaemonEndpoints?,
	val images: List<ContainerImage>?,
	val nodeInfo: NodeSystemInfo?,
	val phase: String?,
	val volumesAttached: List<AttachedVolume>?,
	val volumesInUse: List<String>?
)
