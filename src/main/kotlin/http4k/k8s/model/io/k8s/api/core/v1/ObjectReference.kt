package http4k.k8s.model.io.k8s.api.core.v1

data class ObjectReference(
    val apiVersion: String?,
    val fieldPath: String?,
    val kind: String?,
    val name: String?,
    val namespace: String?,
    val resourceVersion: String?,
    val uid: String?
)
