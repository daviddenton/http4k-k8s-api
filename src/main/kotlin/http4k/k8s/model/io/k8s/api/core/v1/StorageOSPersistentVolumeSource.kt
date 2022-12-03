package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class StorageOSPersistentVolumeSource(
	val fsType: String?,
	val readOnly: Boolean?,
	val secretRef: ObjectReference?,
	val volumeName: String?,
	val volumeNamespace: String?
)
