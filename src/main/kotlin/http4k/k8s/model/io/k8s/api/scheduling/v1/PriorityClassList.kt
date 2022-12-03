package http4k.k8s.model.io.k8s.api.scheduling.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class PriorityClassList(
    val apiVersion: String?,
    val items: List<PriorityClass>,
    val kind: String?,
    val metadata: ListMeta?
)
