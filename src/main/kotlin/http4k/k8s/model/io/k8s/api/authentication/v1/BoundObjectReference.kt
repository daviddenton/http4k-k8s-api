package http4k.k8s.model.io.k8s.api.authentication.v1

data class BoundObjectReference(
    val apiVersion: String?,
    val kind: String?,
    val name: String?,
    val uid: String?
)
