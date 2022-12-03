package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString
import kotlin.String
import kotlin.collections.List

data class HTTPGetAction(
	val host: String?,
	val httpHeaders: List<HTTPHeader>?,
	val path: String?,
	val port: IntOrString,
	val scheme: String?
)
