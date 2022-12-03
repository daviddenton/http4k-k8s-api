package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString

data class RollingUpdateDeployment(
    val maxSurge: IntOrString?,
    val maxUnavailable: IntOrString?
)
