package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

data class QueuingConfiguration(
    val handSize: Int?,
    val queueLengthLimit: Int?,
    val queues: Int?
)
