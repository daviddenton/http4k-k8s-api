package http4k.k8s.model.io.k8s.api.node.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class RuntimeClassList(
    val apiVersion: String?,
    val items: List<RuntimeClass>,
    val kind: String?,
    val metadata: ListMeta?
)
