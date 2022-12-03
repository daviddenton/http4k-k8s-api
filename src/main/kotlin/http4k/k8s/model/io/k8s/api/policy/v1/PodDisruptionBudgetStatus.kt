package http4k.k8s.model.io.k8s.api.policy.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Condition

data class PodDisruptionBudgetStatus(
    val conditions: List<Condition>?,
    val currentHealthy: Int,
    val desiredHealthy: Int,
    val disruptedPods: Map<String, Any>?,
    val disruptionsAllowed: Int,
    val expectedPods: Int,
    val observedGeneration: Int?
)
