package http4k.k8s.model.io.k8s.api.core.v1

data class NodeConfigStatus(
    val active: NodeConfigSource?,
    val assigned: NodeConfigSource?,
    val error: String?,
    val lastKnownGood: NodeConfigSource?
)
