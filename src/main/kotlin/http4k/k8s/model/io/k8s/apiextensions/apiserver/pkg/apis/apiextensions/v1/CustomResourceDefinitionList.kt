package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class CustomResourceDefinitionList(
	val apiVersion: String?,
	val items: List<CustomResourceDefinition>,
	val kind: String?,
	val metadata: ListMeta?
)
