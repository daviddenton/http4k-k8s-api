package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class PersistentVolumeClaimSpec(
    val accessModes: List<String>?,
    val dataSource: TypedLocalObjectReference?,
    val dataSourceRef: TypedObjectReference?,
    val resources: ResourceRequirements?,
    val selector: LabelSelector?,
    val storageClassName: String?,
    val volumeMode: String?,
    val volumeName: String?
)
