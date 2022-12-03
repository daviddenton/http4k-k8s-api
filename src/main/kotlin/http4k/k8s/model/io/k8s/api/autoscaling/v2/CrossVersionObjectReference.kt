package http4k.k8s.model.io.k8s.api.autoscaling.v2

import kotlin.String

data class CrossVersionObjectReference(
	val apiVersion: String?,
	val kind: String,
	val name: String
)
