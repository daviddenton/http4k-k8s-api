package http4k.k8s.model.io.k8s.api.autoscaling.v2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class HorizontalPodAutoscalerStatus(
    val conditions: List<HorizontalPodAutoscalerCondition>?,
    val currentMetrics: List<MetricStatus>?,
    val currentReplicas: Int?,
    val desiredReplicas: Int,
    val lastScaleTime: Time?,
    val observedGeneration: Int?
)
