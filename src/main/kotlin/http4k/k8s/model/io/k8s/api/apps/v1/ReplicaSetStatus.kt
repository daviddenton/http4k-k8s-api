package http4k.k8s.model.io.k8s.api.apps.v1

data class ReplicaSetStatus(
    val availableReplicas: Int?,
    val conditions: List<ReplicaSetCondition>?,
    val fullyLabeledReplicas: Int?,
    val observedGeneration: Int?,
    val readyReplicas: Int?,
    val replicas: Int
)
