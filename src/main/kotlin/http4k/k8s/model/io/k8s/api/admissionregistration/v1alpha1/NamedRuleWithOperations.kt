package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

data class NamedRuleWithOperations(
    val apiGroups: List<String>?,
    val apiVersions: List<String>?,
    val operations: List<String>?,
    val resourceNames: List<String>?,
    val resources: List<String>?,
    val scope: String?
)
