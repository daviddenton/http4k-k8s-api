package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String
import kotlin.collections.List

data class PodDNSConfig(
	val nameservers: List<String>?,
	val options: List<PodDNSConfigOption>?,
	val searches: List<String>?
)
