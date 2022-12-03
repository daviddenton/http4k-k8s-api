package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.String
import kotlin.collections.List

data class PodStatus(
	val conditions: List<PodCondition>?,
	val containerStatuses: List<ContainerStatus>?,
	val ephemeralContainerStatuses: List<ContainerStatus>?,
	val hostIP: String?,
	val initContainerStatuses: List<ContainerStatus>?,
	val message: String?,
	val nominatedNodeName: String?,
	val phase: String?,
	val podIP: String?,
	val podIPs: List<PodIP>?,
	val qosClass: String?,
	val reason: String?,
	val startTime: Time?
)
