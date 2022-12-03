package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class TopologySpreadConstraint(
    val labelSelector: LabelSelector?,
    val matchLabelKeys: List<String>?,
    val maxSkew: Int,
    val minDomains: Int?,
    val nodeAffinityPolicy: String?,
    val nodeTaintsPolicy: String?,
    val topologyKey: String,
    val whenUnsatisfiable: String
)
