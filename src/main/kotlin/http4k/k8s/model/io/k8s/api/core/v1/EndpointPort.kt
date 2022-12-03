package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.String

data class EndpointPort(
	val appProtocol: String?,
	val name: String?,
	val port: Int,
	val protocol: String?
)
