package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

data class CustomResourceSubresources(
	val scale: CustomResourceSubresourceScale?,
	val status: CustomResourceSubresourceStatus?
)
