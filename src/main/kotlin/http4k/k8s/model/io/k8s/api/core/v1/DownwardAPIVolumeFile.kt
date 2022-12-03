package http4k.k8s.model.io.k8s.api.core.v1

data class DownwardAPIVolumeFile(
    val fieldRef: ObjectFieldSelector?,
    val mode: Int?,
    val path: String,
    val resourceFieldRef: ResourceFieldSelector?
)
