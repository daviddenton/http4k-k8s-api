package http4k.k8s.model.io.k8s.api.autoscaling.v2

data class ObjectMetricStatus(
	val current: MetricValueStatus,
	val describedObject: CrossVersionObjectReference,
	val metric: MetricIdentifier
)
