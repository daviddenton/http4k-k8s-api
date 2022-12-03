package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

import kotlin.String
import kotlin.collections.List

data class CustomResourceDefinitionStatus(
	val acceptedNames: CustomResourceDefinitionNames?,
	val conditions: List<CustomResourceDefinitionCondition>?,
	val storedVersions: List<String>?
)
