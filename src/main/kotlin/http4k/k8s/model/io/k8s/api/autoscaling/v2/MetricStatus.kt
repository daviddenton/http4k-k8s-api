package http4k.k8s.model.io.k8s.api.autoscaling.v2

import kotlin.String

data class MetricStatus(
	val containerResource: ContainerResourceMetricStatus?,
	val `external`: ExternalMetricStatus?,
	val `object`: ObjectMetricStatus?,
	val pods: PodsMetricStatus?,
	val resource: ResourceMetricStatus?,
	val type: String
)
