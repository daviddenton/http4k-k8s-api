package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class ValidatingAdmissionPolicyList(
    val apiVersion: String?,
    val items: List<ValidatingAdmissionPolicy>?,
    val kind: String?,
    val metadata: ListMeta?
)
