package http4k.k8s.model.io.k8s.api.admissionregistration.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class MutatingWebhookConfigurationList(
    val apiVersion: String?,
    val items: List<MutatingWebhookConfiguration>,
    val kind: String?,
    val metadata: ListMeta?
)
