package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

data class NonResourcePolicyRule(
    val nonResourceURLs: List<String>,
    val verbs: List<String>
)
