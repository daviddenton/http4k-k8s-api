package http4k.k8s.model.io.k8s.api.storage.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class CSINodeList(
    val apiVersion: String?,
    val items: List<CSINode>,
    val kind: String?,
    val metadata: ListMeta?
)
