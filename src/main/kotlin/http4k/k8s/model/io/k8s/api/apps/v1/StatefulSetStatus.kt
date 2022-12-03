package http4k.k8s.model.io.k8s.api.apps.v1

data class StatefulSetStatus(
    val availableReplicas: Int?,
    val collisionCount: Int?,
    val conditions: List<StatefulSetCondition>?,
    val currentReplicas: Int?,
    val currentRevision: String?,
    val observedGeneration: Int?,
    val readyReplicas: Int?,
    val replicas: Int,
    val updateRevision: String?,
    val updatedReplicas: Int?
)
