package http4k.k8s.model.io.k8s.api.discovery.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class EndpointSliceList(
    val apiVersion: String?,
    val items: List<EndpointSlice>,
    val kind: String?,
    val metadata: ListMeta?
)
