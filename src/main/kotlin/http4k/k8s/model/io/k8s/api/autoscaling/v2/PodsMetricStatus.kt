package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class PodsMetricStatus(
    val current: MetricValueStatus,
    val metric: MetricIdentifier
)
