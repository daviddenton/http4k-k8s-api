package http4k.k8s.model.io.k8s.api.coordination.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class LeaseList(
    val apiVersion: String?,
    val items: List<Lease>,
    val kind: String?,
    val metadata: ListMeta?
)
