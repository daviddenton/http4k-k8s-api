package http4k.k8s.model.io.k8s.api.core.v1

data class EndpointAddress(
    val hostname: String?,
    val ip: String,
    val nodeName: String?,
    val targetRef: ObjectReference?
)
