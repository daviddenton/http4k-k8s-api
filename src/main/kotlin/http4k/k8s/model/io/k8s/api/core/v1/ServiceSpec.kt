package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class ServiceSpec(
	val allocateLoadBalancerNodePorts: Boolean?,
	val clusterIP: String?,
	val clusterIPs: List<String>?,
	val externalIPs: List<String>?,
	val externalName: String?,
	val externalTrafficPolicy: String?,
	val healthCheckNodePort: Int?,
	val internalTrafficPolicy: String?,
	val ipFamilies: List<String>?,
	val ipFamilyPolicy: String?,
	val loadBalancerClass: String?,
	val loadBalancerIP: String?,
	val loadBalancerSourceRanges: List<String>?,
	val ports: List<ServicePort>?,
	val publishNotReadyAddresses: Boolean?,
	val selector: Map<String, Any>?,
	val sessionAffinity: String?,
	val sessionAffinityConfig: SessionAffinityConfig?,
	val type: String?
)
