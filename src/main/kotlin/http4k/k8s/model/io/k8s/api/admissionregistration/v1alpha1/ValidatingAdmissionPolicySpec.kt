package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

import kotlin.String
import kotlin.collections.List

data class ValidatingAdmissionPolicySpec(
	val failurePolicy: String?,
	val matchConstraints: MatchResources?,
	val paramKind: ParamKind?,
	val validations: List<Validation>
)
