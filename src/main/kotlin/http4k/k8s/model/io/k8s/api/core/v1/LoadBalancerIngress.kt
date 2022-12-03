package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String
import kotlin.collections.List

data class LoadBalancerIngress(
	val hostname: String?,
	val ip: String?,
	val ports: List<PortStatus>?
)
