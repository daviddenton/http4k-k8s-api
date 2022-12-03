package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class ContainerResourceMetricStatus(
    val container: String,
    val current: MetricValueStatus,
    val name: String
)
