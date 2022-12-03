package http4k.k8s.model.io.k8s.api.storage.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class StorageClassList(
    val apiVersion: String?,
    val items: List<StorageClass>,
    val kind: String?,
    val metadata: ListMeta?
)
