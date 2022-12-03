package http4k.k8s.model.io.k8s.api.admissionregistration.v1

import kotlin.String

data class WebhookClientConfig(
	val caBundle: String?,
	val service: ServiceReference?,
	val url: String?
)
