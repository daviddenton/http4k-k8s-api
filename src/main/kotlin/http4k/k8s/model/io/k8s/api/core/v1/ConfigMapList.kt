package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ConfigMapList(
    val apiVersion: String?,
    val items: List<ConfigMap>,
    val kind: String?,
    val metadata: ListMeta?
)
