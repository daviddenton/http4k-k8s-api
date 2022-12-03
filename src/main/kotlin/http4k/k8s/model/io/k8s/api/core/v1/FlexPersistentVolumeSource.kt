package http4k.k8s.model.io.k8s.api.core.v1

data class FlexPersistentVolumeSource(
    val driver: String,
    val fsType: String?,
    val options: Map<String, Any>?,
    val readOnly: Boolean?,
    val secretRef: SecretReference?
)
