package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

data class LimitResponse(
    val queuing: QueuingConfiguration?,
    val type: String
)
