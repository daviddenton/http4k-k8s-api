package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class SecretVolumeSource(
	val defaultMode: Int?,
	val items: List<KeyToPath>?,
	val optional: Boolean?,
	val secretName: String?
)
