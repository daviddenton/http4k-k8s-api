package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class WebhookConversion(
    val clientConfig: WebhookClientConfig?,
    val conversionReviewVersions: List<String>
)
