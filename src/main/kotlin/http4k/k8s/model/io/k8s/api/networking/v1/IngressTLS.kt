package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.String
import kotlin.collections.List

data class IngressTLS(
	val hosts: List<String>?,
	val secretName: String?
)
