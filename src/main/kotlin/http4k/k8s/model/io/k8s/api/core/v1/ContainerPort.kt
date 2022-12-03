package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.String

data class ContainerPort(
	val containerPort: Int,
	val hostIP: String?,
	val hostPort: Int?,
	val name: String?,
	val protocol: String?
)
