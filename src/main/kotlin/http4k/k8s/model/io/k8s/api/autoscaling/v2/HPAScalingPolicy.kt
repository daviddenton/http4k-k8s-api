package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class HPAScalingPolicy(
    val periodSeconds: Int,
    val type: String,
    val `value`: Int
)
