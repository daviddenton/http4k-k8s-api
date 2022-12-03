package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String

data class ValidatingAdmissionPolicy(
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val spec: ValidatingAdmissionPolicySpec?
)
