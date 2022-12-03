package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class ServerAddressByClientCIDR(
    val clientCIDR: String,
    val serverAddress: String
)
