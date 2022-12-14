package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.util.intstr.IntOrString

data class RollingUpdateDaemonSet(
    val maxSurge: IntOrString?,
    val maxUnavailable: IntOrString?
)
