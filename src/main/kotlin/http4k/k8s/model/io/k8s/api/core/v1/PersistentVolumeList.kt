package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class PersistentVolumeList(
    val apiVersion: String?,
    val items: List<PersistentVolume>,
    val kind: String?,
    val metadata: ListMeta?
)
