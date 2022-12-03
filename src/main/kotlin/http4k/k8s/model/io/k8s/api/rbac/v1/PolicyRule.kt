package http4k.k8s.model.io.k8s.api.rbac.v1

data class PolicyRule(
    val apiGroups: List<String>?,
    val nonResourceURLs: List<String>?,
    val resourceNames: List<String>?,
    val resources: List<String>?,
    val verbs: List<String>
)
