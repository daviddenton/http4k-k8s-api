package http4k.k8s.model.io.k8s.api.networking.v1

data class IngressClassParametersReference(
    val apiGroup: String?,
    val kind: String,
    val name: String,
    val namespace: String?,
    val scope: String?
)
