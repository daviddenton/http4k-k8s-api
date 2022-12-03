package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class EnvVar(
	val name: String,
	val `value`: String?,
	val valueFrom: EnvVarSource?
)
