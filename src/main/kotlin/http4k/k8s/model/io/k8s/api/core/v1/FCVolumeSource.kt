package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class FCVolumeSource(
	val fsType: String?,
	val lun: Int?,
	val readOnly: Boolean?,
	val targetWWNs: List<String>?,
	val wwids: List<String>?
)
