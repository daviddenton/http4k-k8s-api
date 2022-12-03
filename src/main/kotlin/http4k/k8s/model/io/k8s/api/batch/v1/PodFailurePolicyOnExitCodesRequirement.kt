package http4k.k8s.model.io.k8s.api.batch.v1

data class PodFailurePolicyOnExitCodesRequirement(
    val containerName: String?,
    val `operator`: String,
    val values: List<Int>
)
