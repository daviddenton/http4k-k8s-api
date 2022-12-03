package http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class MatchResources(
    val excludeResourceRules: List<NamedRuleWithOperations>?,
    val matchPolicy: String?,
    val namespaceSelector: LabelSelector?,
    val objectSelector: LabelSelector?,
    val resourceRules: List<NamedRuleWithOperations>?
)
