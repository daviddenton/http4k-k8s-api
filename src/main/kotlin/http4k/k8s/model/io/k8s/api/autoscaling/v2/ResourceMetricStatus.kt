package http4k.k8s.model.io.k8s.api.autoscaling.v2

import kotlin.String

data class ResourceMetricStatus(
	val current: MetricValueStatus,
	val name: String
)
