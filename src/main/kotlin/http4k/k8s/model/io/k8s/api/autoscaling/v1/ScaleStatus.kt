package http4k.k8s.model.io.k8s.api.autoscaling.v1

import kotlin.Int
import kotlin.String

data class ScaleStatus(
	val replicas: Int,
	val selector: String?
)
