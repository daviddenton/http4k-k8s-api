package http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class StorageVersionList(
    val apiVersion: String?,
    val items: List<StorageVersion>,
    val kind: String?,
    val metadata: ListMeta?
)
