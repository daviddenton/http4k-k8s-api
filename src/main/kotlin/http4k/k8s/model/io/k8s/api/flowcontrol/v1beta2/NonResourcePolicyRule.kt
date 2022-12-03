package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

data class NonResourcePolicyRule(
    val nonResourceURLs: List<String>,
    val verbs: List<String>
)
