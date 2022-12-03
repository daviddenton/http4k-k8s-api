package http4k.k8s.model.io.k8s.api.core.v1

data class ContainerImage(
    val names: List<String>?,
    val sizeBytes: Int?
)
