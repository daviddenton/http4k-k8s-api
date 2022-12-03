package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.String
import kotlin.collections.List

data class IngressLoadBalancerIngress(
	val hostname: String?,
	val ip: String?,
	val ports: List<IngressPortStatus>?
)
