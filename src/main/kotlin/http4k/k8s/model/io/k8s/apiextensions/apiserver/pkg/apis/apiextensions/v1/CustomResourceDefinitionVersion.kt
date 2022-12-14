package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class CustomResourceDefinitionVersion(
    val additionalPrinterColumns: List<CustomResourceColumnDefinition>?,
    val deprecated: Boolean?,
    val deprecationWarning: String?,
    val name: String,
    val schema: CustomResourceValidation?,
    val served: Boolean,
    val storage: Boolean,
    val subresources: CustomResourceSubresources?
)
