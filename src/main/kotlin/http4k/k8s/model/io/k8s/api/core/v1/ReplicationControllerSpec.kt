package http4k.k8s.model.io.k8s.api.core.v1

data class ReplicationControllerSpec(
    val minReadySeconds: Int?,
    val replicas: Int?,
    val selector: Map<String, Any>?,
    val template: PodTemplateSpec?
)
