package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ControllerRevisionList(
    val apiVersion: String?,
    val items: List<ControllerRevision>,
    val kind: String?,
    val metadata: ListMeta?
)
