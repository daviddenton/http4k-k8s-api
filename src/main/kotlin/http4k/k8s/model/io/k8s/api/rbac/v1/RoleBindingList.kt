package http4k.k8s.model.io.k8s.api.rbac.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class RoleBindingList(
    val apiVersion: String?,
    val items: List<RoleBinding>,
    val kind: String?,
    val metadata: ListMeta?
)
