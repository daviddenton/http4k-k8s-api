package http4k.k8s.model.io.k8s.api.apps.v1

data class StatefulSetUpdateStrategy(
    val rollingUpdate: RollingUpdateStatefulSetStrategy?,
    val type: String?
)
