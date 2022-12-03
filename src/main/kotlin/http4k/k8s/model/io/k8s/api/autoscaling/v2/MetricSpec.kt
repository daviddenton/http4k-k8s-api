package http4k.k8s.model.io.k8s.api.autoscaling.v2

import kotlin.String

data class MetricSpec(
	val containerResource: ContainerResourceMetricSource?,
	val `external`: ExternalMetricSource?,
	val `object`: ObjectMetricSource?,
	val pods: PodsMetricSource?,
	val resource: ResourceMetricSource?,
	val type: String
)
