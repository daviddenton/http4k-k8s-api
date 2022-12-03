package http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1

data class ServiceReference(
    val name: String?,
    val namespace: String?,
    val port: Int?
)
