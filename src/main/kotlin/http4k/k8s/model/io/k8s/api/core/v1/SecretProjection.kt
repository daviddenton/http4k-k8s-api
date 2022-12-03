package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class SecretProjection(
	val items: List<KeyToPath>?,
	val name: String?,
	val optional: Boolean?
)
