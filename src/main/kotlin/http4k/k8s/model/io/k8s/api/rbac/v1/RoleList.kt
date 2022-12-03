package http4k.k8s.model.io.k8s.api.rbac.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class RoleList(
    val apiVersion: String?,
    val items: List<Role>,
    val kind: String?,
    val metadata: ListMeta?
)
