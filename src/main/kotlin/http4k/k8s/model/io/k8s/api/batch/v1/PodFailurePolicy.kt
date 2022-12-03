package http4k.k8s.model.io.k8s.api.batch.v1

data class PodFailurePolicy(
    val rules: List<PodFailurePolicyRule>
)
