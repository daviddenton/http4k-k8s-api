package http4k.k8s.model.io.k8s.api.apps.v1

data class DeploymentStatus(
    val availableReplicas: Int?,
    val collisionCount: Int?,
    val conditions: List<DeploymentCondition>?,
    val observedGeneration: Int?,
    val readyReplicas: Int?,
    val replicas: Int?,
    val unavailableReplicas: Int?,
    val updatedReplicas: Int?
)
