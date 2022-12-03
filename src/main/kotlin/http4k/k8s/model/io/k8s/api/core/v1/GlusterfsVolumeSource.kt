package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class GlusterfsVolumeSource(
	val endpoints: String,
	val path: String,
	val readOnly: Boolean?
)
