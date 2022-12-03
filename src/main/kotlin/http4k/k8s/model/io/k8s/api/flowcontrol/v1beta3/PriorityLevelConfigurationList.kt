package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class PriorityLevelConfigurationList(
    val apiVersion: String?,
    val items: List<PriorityLevelConfiguration>,
    val kind: String?,
    val metadata: ListMeta?
)
