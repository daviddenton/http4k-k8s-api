package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.String
import kotlin.collections.List

data class IPBlock(
	val cidr: String,
	val except: List<String>?
)
