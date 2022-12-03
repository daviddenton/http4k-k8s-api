package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ReplicationControllerList(
    val apiVersion: String?,
    val items: List<ReplicationController>,
    val kind: String?,
    val metadata: ListMeta?
)
