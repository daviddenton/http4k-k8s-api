package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String

data class GCEPersistentDiskVolumeSource(
	val fsType: String?,
	val partition: Int?,
	val pdName: String,
	val readOnly: Boolean?
)
