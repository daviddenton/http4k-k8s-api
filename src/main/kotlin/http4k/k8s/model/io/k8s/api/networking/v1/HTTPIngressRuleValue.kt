package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.collections.List

data class HTTPIngressRuleValue(
	val paths: List<HTTPIngressPath>
)
