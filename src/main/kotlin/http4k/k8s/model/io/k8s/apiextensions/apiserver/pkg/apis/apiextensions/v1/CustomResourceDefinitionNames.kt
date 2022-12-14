package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class CustomResourceDefinitionNames(
    val categories: List<String>?,
    val kind: String,
    val listKind: String?,
    val plural: String,
    val shortNames: List<String>?,
    val singular: String?
)
