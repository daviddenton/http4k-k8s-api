package http4k.k8s.model.io.k8s.api.storage.v1beta1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class CSIStorageCapacityList(
    val apiVersion: String?,
    val items: List<CSIStorageCapacity>,
    val kind: String?,
    val metadata: ListMeta?
)
