package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class ConfigMapKeySelector(
	val key: String,
	val name: String?,
	val optional: Boolean?
)
