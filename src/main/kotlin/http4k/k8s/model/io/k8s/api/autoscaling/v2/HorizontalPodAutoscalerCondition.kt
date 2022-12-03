package http4k.k8s.model.io.k8s.api.autoscaling.v2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.String

data class HorizontalPodAutoscalerCondition(
	val lastTransitionTime: Time?,
	val message: String?,
	val reason: String?,
	val status: String,
	val type: String
)
