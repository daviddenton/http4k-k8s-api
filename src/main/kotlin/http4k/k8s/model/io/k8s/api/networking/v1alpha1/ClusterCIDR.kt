package http4k.k8s.model.io.k8s.api.networking.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class ClusterCIDR(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: ClusterCIDRSpec?
)
