package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

import java.math.BigDecimal

data class JSONSchemaProps(
    val ref: String?,
    val schema: String?,
    val additionalItems: JSONSchemaPropsOrBool?,
    val additionalProperties: JSONSchemaPropsOrBool?,
    val allOf: List<JSONSchemaProps>?,
    val anyOf: List<JSONSchemaProps>?,
    val default: JSON?,
    val definitions: Map<String, Any>?,
    val dependencies: Map<String, Any>?,
    val description: String?,
    val `enum`: List<JSON>?,
    val example: JSON?,
    val exclusiveMaximum: Boolean?,
    val exclusiveMinimum: Boolean?,
    val externalDocs: ExternalDocumentation?,
    val format: String?,
    val id: String?,
    val items: JSONSchemaPropsOrArray?,
    val maxItems: Int?,
    val maxLength: Int?,
    val maxProperties: Int?,
    val maximum: BigDecimal?,
    val minItems: Int?,
    val minLength: Int?,
    val minProperties: Int?,
    val minimum: BigDecimal?,
    val multipleOf: BigDecimal?,
    val not: JSONSchemaProps?,
    val nullable: Boolean?,
    val oneOf: List<JSONSchemaProps>?,
    val pattern: String?,
    val patternProperties: Map<String, Any>?,
    val properties: Map<String, Any>?,
    val required: List<String>?,
    val title: String?,
    val type: String?,
    val uniqueItems: Boolean?,
    val xkubernetesembeddedresource: Boolean?,
    val xkubernetesintorstring: Boolean?,
    val xkuberneteslistmapkeys: List<String>?,
    val xkuberneteslisttype: String?,
    val xkubernetesmaptype: String?,
    val xkubernetespreserveunknownfields: Boolean?,
    val xkubernetesvalidations: List<ValidationRule>?
)
