package http4k.k8s.model.io.k8s.api.autoscaling.v2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String

data class HorizontalPodAutoscaler(
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val spec: HorizontalPodAutoscalerSpec?,
	val status: HorizontalPodAutoscalerStatus?
)
