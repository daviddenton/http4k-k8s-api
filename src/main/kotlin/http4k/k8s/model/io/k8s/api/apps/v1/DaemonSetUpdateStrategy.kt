package http4k.k8s.model.io.k8s.api.apps.v1

data class DaemonSetUpdateStrategy(
    val rollingUpdate: RollingUpdateDaemonSet?,
    val type: String?
)
