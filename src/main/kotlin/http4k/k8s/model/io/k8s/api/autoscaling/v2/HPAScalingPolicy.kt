package http4k.k8s.model.io.k8s.api.autoscaling.v2

import kotlin.Int
import kotlin.String

data class HPAScalingPolicy(
	val periodSeconds: Int,
	val type: String,
	val `value`: Int
)
