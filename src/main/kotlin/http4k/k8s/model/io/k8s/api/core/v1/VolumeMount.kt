package http4k.k8s.model.io.k8s.api.core.v1

data class VolumeMount(
    val mountPath: String,
    val mountPropagation: String?,
    val name: String,
    val readOnly: Boolean?,
    val subPath: String?,
    val subPathExpr: String?
)
