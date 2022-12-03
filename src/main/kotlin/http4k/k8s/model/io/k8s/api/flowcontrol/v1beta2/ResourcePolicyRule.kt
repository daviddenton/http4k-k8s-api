package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

data class ResourcePolicyRule(
    val apiGroups: List<String>,
    val clusterScope: Boolean?,
    val namespaces: List<String>?,
    val resources: List<String>,
    val verbs: List<String>
)
