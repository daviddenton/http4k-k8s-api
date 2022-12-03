package http4k.k8s.model.io.k8s.api.core.v1

data class CSIPersistentVolumeSource(
    val controllerExpandSecretRef: SecretReference?,
    val controllerPublishSecretRef: SecretReference?,
    val driver: String,
    val fsType: String?,
    val nodeExpandSecretRef: SecretReference?,
    val nodePublishSecretRef: SecretReference?,
    val nodeStageSecretRef: SecretReference?,
    val readOnly: Boolean?,
    val volumeAttributes: Map<String, Any>?,
    val volumeHandle: String
)
