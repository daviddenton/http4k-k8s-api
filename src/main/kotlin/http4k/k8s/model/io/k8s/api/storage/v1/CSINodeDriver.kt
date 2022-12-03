package http4k.k8s.model.io.k8s.api.storage.v1

data class CSINodeDriver(
    val allocatable: VolumeNodeResources?,
    val name: String,
    val nodeID: String,
    val topologyKeys: List<String>?
)
