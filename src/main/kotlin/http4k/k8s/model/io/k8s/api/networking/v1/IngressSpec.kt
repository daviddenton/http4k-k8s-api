package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.String
import kotlin.collections.List

data class IngressSpec(
	val defaultBackend: IngressBackend?,
	val ingressClassName: String?,
	val rules: List<IngressRule>?,
	val tls: List<IngressTLS>?
)
