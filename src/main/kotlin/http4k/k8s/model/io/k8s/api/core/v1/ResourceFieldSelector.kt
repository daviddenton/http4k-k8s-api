package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.api.resource.Quantity
import kotlin.String

data class ResourceFieldSelector(
	val containerName: String?,
	val divisor: Quantity?,
	val resource: String
)
