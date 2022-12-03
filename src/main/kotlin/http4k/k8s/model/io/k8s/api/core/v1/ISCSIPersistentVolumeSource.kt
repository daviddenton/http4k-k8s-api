package http4k.k8s.model.io.k8s.api.core.v1

data class ISCSIPersistentVolumeSource(
    val chapAuthDiscovery: Boolean?,
    val chapAuthSession: Boolean?,
    val fsType: String?,
    val initiatorName: String?,
    val iqn: String,
    val iscsiInterface: String?,
    val lun: Int,
    val portals: List<String>?,
    val readOnly: Boolean?,
    val secretRef: SecretReference?,
    val targetPortal: String
)
