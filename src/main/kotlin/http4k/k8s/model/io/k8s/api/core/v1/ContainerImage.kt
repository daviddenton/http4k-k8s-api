package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class ContainerImage(
	val names: List<String>?,
	val sizeBytes: Int?
)
