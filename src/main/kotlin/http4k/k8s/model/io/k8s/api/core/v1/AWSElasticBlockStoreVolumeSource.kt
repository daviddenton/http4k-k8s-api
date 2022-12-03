package http4k.k8s.model.io.k8s.api.core.v1

data class AWSElasticBlockStoreVolumeSource(
    val fsType: String?,
    val partition: Int?,
    val readOnly: Boolean?,
    val volumeID: String
)
