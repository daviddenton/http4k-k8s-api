package http4k.k8s.model.io.k8s.api.node.v1

import http4k.k8s.model.io.k8s.api.core.v1.Toleration

data class Scheduling(
    val nodeSelector: Map<String, Any>?,
    val tolerations: List<Toleration>?
)
