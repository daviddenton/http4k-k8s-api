package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class OwnerReference(
    val apiVersion: String,
    val blockOwnerDeletion: Boolean?,
    val controller: Boolean?,
    val kind: String,
    val name: String,
    val uid: String
)
