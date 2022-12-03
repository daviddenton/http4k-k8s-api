package http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1

data class ServerStorageVersion(
    val apiServerID: String?,
    val decodableVersions: List<String>?,
    val encodingVersion: String?
)
