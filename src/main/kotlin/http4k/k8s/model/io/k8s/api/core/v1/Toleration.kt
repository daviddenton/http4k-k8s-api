package http4k.k8s.model.io.k8s.api.core.v1

data class Toleration(
    val effect: String?,
    val key: String?,
    val `operator`: String?,
    val tolerationSeconds: Int?,
    val `value`: String?
)
