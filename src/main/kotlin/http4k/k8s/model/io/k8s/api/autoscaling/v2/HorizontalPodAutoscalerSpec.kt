package http4k.k8s.model.io.k8s.api.autoscaling.v2

import kotlin.Int
import kotlin.collections.List

data class HorizontalPodAutoscalerSpec(
	val behavior: HorizontalPodAutoscalerBehavior?,
	val maxReplicas: Int,
	val metrics: List<MetricSpec>?,
	val minReplicas: Int?,
	val scaleTargetRef: CrossVersionObjectReference
)
