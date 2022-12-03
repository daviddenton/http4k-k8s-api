package http4k.k8s.model.io.k8s.api.discovery.v1

import kotlin.collections.List

data class EndpointHints(
	val forZones: List<ForZone>?
)
