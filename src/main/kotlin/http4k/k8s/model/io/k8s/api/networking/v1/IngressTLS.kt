package http4k.k8s.model.io.k8s.api.networking.v1

data class IngressTLS(
    val hosts: List<String>?,
    val secretName: String?
)
