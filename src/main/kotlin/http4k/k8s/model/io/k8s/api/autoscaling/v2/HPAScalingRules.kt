package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class HPAScalingRules(
    val policies: List<HPAScalingPolicy>?,
    val selectPolicy: String?,
    val stabilizationWindowSeconds: Int?
)
