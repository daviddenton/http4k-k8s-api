package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ResourceQuotaList(
    val apiVersion: String?,
    val items: List<ResourceQuota>,
    val kind: String?,
    val metadata: ListMeta?
)
