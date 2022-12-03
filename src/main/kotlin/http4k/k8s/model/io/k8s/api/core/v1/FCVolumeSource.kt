package http4k.k8s.model.io.k8s.api.core.v1

data class FCVolumeSource(
    val fsType: String?,
    val lun: Int?,
    val readOnly: Boolean?,
    val targetWWNs: List<String>?,
    val wwids: List<String>?
)
