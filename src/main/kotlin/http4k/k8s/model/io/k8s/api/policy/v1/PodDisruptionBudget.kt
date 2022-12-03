package http4k.k8s.model.io.k8s.api.policy.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class PodDisruptionBudget(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: PodDisruptionBudgetSpec?,
    val status: PodDisruptionBudgetStatus?
)
