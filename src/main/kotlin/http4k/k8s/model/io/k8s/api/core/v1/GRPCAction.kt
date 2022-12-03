package http4k.k8s.model.io.k8s.api.core.v1

data class GRPCAction(
    val port: Int,
    val service: String?
)
