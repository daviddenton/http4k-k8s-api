package http4k.k8s.model.io.k8s.api.core.v1

data class SELinuxOptions(
    val level: String?,
    val role: String?,
    val type: String?,
    val user: String?
)
