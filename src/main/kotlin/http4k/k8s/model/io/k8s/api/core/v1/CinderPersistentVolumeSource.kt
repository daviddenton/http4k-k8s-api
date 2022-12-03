package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class CinderPersistentVolumeSource(
	val fsType: String?,
	val readOnly: Boolean?,
	val secretRef: SecretReference?,
	val volumeID: String
)
