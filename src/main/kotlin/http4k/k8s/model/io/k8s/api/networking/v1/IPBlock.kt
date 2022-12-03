package http4k.k8s.model.io.k8s.api.networking.v1

data class IPBlock(
    val cidr: String,
    val except: List<String>?
)
