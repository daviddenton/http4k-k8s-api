package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class HorizontalPodAutoscalerBehavior(
    val scaleDown: HPAScalingRules?,
    val scaleUp: HPAScalingRules?
)
