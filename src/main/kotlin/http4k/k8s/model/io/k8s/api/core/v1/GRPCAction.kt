package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.String

data class GRPCAction(
	val port: Int,
	val service: String?
)
