package http4k.k8s.model.io.k8s.api.node.v1

import http4k.k8s.model.io.k8s.api.core.v1.Toleration
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class Scheduling(
	val nodeSelector: Map<String, Any>?,
	val tolerations: List<Toleration>?
)
