package http4k.k8s.model.io.k8s.api.autoscaling.v1

data class ScaleStatus(
    val replicas: Int,
    val selector: String?
)
