package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class ContainerResourceMetricSource(
    val container: String,
    val name: String,
    val target: MetricTarget
)
