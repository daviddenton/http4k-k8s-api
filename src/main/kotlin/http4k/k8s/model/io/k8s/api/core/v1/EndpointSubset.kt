package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.collections.List

data class EndpointSubset(
	val addresses: List<EndpointAddress>?,
	val notReadyAddresses: List<EndpointAddress>?,
	val ports: List<EndpointPort>?
)
