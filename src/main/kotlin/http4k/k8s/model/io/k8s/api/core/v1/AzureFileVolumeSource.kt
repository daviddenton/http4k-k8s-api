package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class AzureFileVolumeSource(
	val readOnly: Boolean?,
	val secretName: String,
	val shareName: String
)
