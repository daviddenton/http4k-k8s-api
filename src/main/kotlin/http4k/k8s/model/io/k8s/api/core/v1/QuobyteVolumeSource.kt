package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class QuobyteVolumeSource(
	val group: String?,
	val readOnly: Boolean?,
	val registry: String,
	val tenant: String?,
	val user: String?,
	val volume: String
)
