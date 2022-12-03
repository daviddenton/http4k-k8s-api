package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class StorageOSVolumeSource(
	val fsType: String?,
	val readOnly: Boolean?,
	val secretRef: LocalObjectReference?,
	val volumeName: String?,
	val volumeNamespace: String?
)
