package http4k.k8s.model.io.k8s.api.rbac.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ClusterRoleList(
    val apiVersion: String?,
    val items: List<ClusterRole>,
    val kind: String?,
    val metadata: ListMeta?
)
