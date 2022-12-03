package http4k.k8s.model.io.k8s.api.policy.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class PodDisruptionBudgetList(
    val apiVersion: String?,
    val items: List<PodDisruptionBudget>,
    val kind: String?,
    val metadata: ListMeta?
)
