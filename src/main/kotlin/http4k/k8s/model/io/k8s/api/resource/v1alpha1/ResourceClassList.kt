package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ResourceClassList(
    val apiVersion: String?,
    val items: List<ResourceClass>,
    val kind: String?,
    val metadata: ListMeta?
)
