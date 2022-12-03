package http4k.k8s.model.io.k8s.api.admissionregistration.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class MutatingWebhook(
    val admissionReviewVersions: List<String>,
    val clientConfig: WebhookClientConfig,
    val failurePolicy: String?,
    val matchPolicy: String?,
    val name: String,
    val namespaceSelector: LabelSelector?,
    val objectSelector: LabelSelector?,
    val reinvocationPolicy: String?,
    val rules: List<RuleWithOperations>?,
    val sideEffects: String,
    val timeoutSeconds: Int?
)
