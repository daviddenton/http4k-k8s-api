package http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1

data class StorageVersionStatus(
    val commonEncodingVersion: String?,
    val conditions: List<StorageVersionCondition>?,
    val storageVersions: List<ServerStorageVersion>?
)
