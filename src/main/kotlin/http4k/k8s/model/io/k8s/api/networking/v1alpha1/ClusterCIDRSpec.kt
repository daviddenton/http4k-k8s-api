package http4k.k8s.model.io.k8s.api.networking.v1alpha1

import http4k.k8s.model.io.k8s.api.core.v1.NodeSelector

data class ClusterCIDRSpec(
    val ipv4: String?,
    val ipv6: String?,
    val nodeSelector: NodeSelector?,
    val perNodeHostBits: Int
)
