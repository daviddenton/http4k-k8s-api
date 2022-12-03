package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

data class CSIVolumeSource(
	val driver: String,
	val fsType: String?,
	val nodePublishSecretRef: LocalObjectReference?,
	val readOnly: Boolean?,
	val volumeAttributes: Map<String, Any>?
)
