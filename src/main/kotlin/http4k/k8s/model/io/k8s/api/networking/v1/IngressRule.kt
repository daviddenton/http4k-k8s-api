package http4k.k8s.model.io.k8s.api.networking.v1

data class IngressRule(
    val host: String?,
    val http: HTTPIngressRuleValue?
)
