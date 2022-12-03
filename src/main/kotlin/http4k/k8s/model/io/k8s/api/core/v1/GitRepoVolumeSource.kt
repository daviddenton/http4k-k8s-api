package http4k.k8s.model.io.k8s.api.core.v1

data class GitRepoVolumeSource(
    val directory: String?,
    val repository: String,
    val revision: String?
)
