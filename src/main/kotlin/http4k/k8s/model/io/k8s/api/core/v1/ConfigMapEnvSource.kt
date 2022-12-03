package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class ConfigMapEnvSource(
	val name: String?,
	val optional: Boolean?
)
