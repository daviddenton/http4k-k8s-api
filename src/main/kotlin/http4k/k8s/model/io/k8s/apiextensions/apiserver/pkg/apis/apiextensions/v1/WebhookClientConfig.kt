package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class WebhookClientConfig(
    val caBundle: String?,
    val service: ServiceReference?,
    val url: String?
)
