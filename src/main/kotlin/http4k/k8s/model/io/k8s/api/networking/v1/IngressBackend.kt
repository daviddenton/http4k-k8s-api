package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.api.core.v1.TypedLocalObjectReference

data class IngressBackend(
	val resource: TypedLocalObjectReference?,
	val service: IngressServiceBackend?
)
