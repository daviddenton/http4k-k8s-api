package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import kotlin.String

data class ResourceClassParametersReference(
	val apiGroup: String?,
	val kind: String,
	val name: String,
	val namespace: String?
)
