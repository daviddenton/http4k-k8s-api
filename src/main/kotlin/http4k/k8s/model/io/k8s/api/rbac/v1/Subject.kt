package http4k.k8s.model.io.k8s.api.rbac.v1

data class Subject(
    val apiGroup: String?,
    val kind: String,
    val name: String,
    val namespace: String?
)
