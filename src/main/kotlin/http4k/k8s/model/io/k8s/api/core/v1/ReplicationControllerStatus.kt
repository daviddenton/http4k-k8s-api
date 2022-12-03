package http4k.k8s.model.io.k8s.api.core.v1

data class ReplicationControllerStatus(
    val availableReplicas: Int?,
    val conditions: List<ReplicationControllerCondition>?,
    val fullyLabeledReplicas: Int?,
    val observedGeneration: Int?,
    val readyReplicas: Int?,
    val replicas: Int
)
