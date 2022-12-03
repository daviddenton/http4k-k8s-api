package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class CustomResourceDefinitionSpec(
    val conversion: CustomResourceConversion?,
    val group: String,
    val names: CustomResourceDefinitionNames,
    val preserveUnknownFields: Boolean?,
    val scope: String,
    val versions: List<CustomResourceDefinitionVersion>
)
