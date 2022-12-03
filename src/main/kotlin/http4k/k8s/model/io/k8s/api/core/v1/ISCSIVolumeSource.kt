package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class ISCSIVolumeSource(
	val chapAuthDiscovery: Boolean?,
	val chapAuthSession: Boolean?,
	val fsType: String?,
	val initiatorName: String?,
	val iqn: String,
	val iscsiInterface: String?,
	val lun: Int,
	val portals: List<String>?,
	val readOnly: Boolean?,
	val secretRef: LocalObjectReference?,
	val targetPortal: String
)
