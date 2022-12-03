package http4k.k8s.model.io.k8s.api.networking.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ClusterCIDRList(
    val apiVersion: String?,
    val items: List<ClusterCIDR>,
    val kind: String?,
    val metadata: ListMeta?
)
