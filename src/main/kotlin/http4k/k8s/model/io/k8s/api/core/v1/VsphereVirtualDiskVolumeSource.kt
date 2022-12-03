package http4k.k8s.model.io.k8s.api.core.v1

data class VsphereVirtualDiskVolumeSource(
    val fsType: String?,
    val storagePolicyID: String?,
    val storagePolicyName: String?,
    val volumePath: String
)
