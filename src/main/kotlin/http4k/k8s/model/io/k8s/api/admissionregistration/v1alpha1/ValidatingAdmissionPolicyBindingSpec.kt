package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

data class ValidatingAdmissionPolicyBindingSpec(
    val matchResources: MatchResources?,
    val paramRef: ParamRef?,
    val policyName: String?
)
