package http4k.k8s.model.io.k8s.api.autoscaling.v1

data class HorizontalPodAutoscalerSpec(
    val maxReplicas: Int,
    val minReplicas: Int?,
    val scaleTargetRef: CrossVersionObjectReference,
    val targetCPUUtilizationPercentage: Int?
)
