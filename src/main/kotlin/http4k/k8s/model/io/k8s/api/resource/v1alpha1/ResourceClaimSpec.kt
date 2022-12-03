package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import kotlin.String

data class ResourceClaimSpec(
	val allocationMode: String?,
	val parametersRef: ResourceClaimParametersReference?,
	val resourceClassName: String
)
