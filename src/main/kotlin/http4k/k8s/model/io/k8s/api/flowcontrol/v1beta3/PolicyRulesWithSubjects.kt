package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

data class PolicyRulesWithSubjects(
    val nonResourceRules: List<NonResourcePolicyRule>?,
    val resourceRules: List<ResourcePolicyRule>?,
    val subjects: List<Subject>
)
