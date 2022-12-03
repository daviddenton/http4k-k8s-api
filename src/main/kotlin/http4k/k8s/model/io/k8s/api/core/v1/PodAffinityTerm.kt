package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class PodAffinityTerm(
    val labelSelector: LabelSelector?,
    val namespaceSelector: LabelSelector?,
    val namespaces: List<String>?,
    val topologyKey: String
)
