package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class ScaleIOPersistentVolumeSource(
	val fsType: String?,
	val gateway: String,
	val protectionDomain: String?,
	val readOnly: Boolean?,
	val secretRef: SecretReference,
	val sslEnabled: Boolean?,
	val storageMode: String?,
	val storagePool: String?,
	val system: String,
	val volumeName: String?
)
