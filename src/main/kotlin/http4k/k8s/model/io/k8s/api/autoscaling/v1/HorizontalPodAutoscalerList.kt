package http4k.k8s.model.io.k8s.api.autoscaling.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class HorizontalPodAutoscalerList(
    val apiVersion: String?,
    val items: List<HorizontalPodAutoscaler>,
    val kind: String?,
    val metadata: ListMeta?
)
