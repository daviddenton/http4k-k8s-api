package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class CustomResourceColumnDefinition(
    val description: String?,
    val format: String?,
    val jsonPath: String,
    val name: String,
    val priority: Int?,
    val type: String
)
