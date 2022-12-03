package http4k.k8s.model.io.k8s.api.storage.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class CSIDriverList(
    val apiVersion: String?,
    val items: List<CSIDriver>,
    val kind: String?,
    val metadata: ListMeta?
)
