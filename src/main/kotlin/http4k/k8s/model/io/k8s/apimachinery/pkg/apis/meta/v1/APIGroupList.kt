package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class APIGroupList(
    val apiVersion: String?,
    val groups: List<APIGroup>,
    val kind: String?
)
