package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class ExternalMetricSource(
	val metric: MetricIdentifier,
	val target: MetricTarget
)
