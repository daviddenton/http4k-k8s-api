package http4k.k8s.model.io.k8s.api.batch.v1

data class UncountedTerminatedPods(
    val failed: List<String>?,
    val succeeded: List<String>?
)
