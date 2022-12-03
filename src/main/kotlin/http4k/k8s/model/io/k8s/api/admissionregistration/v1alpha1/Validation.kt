package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

import kotlin.String

data class Validation(
	val expression: String,
	val message: String?,
	val reason: String?
)
