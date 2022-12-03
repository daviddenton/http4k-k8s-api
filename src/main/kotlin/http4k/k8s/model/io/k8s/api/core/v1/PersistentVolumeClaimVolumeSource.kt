package http4k.k8s.model.io.k8s.api.core.v1

data class PersistentVolumeClaimVolumeSource(
    val claimName: String,
    val readOnly: Boolean?
)
