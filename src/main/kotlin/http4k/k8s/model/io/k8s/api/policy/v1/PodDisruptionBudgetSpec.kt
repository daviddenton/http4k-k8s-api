package http4k.k8s.model.io.k8s.api.policy.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector
import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString

data class PodDisruptionBudgetSpec(
    val maxUnavailable: IntOrString?,
    val minAvailable: IntOrString?,
    val selector: LabelSelector?,
    val unhealthyPodEvictionPolicy: String?
)
