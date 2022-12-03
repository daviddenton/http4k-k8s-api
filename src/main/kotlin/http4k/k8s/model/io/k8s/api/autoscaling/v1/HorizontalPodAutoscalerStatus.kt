package http4k.k8s.model.io.k8s.api.autoscaling.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.Int

data class HorizontalPodAutoscalerStatus(
	val currentCPUUtilizationPercentage: Int?,
	val currentReplicas: Int,
	val desiredReplicas: Int,
	val lastScaleTime: Time?,
	val observedGeneration: Int?
)
