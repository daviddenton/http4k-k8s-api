package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

import kotlin.String

data class CustomResourceSubresourceScale(
	val labelSelectorPath: String?,
	val specReplicasPath: String,
	val statusReplicasPath: String
)
