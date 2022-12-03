package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.String

data class Toleration(
	val effect: String?,
	val key: String?,
	val `operator`: String?,
	val tolerationSeconds: Int?,
	val `value`: String?
)
