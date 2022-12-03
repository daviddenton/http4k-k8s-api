package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String

data class CustomResourceDefinition(
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val spec: CustomResourceDefinitionSpec,
	val status: CustomResourceDefinitionStatus?
)
