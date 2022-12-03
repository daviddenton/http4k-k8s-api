package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class ResourceClaimTemplateSpec(
	val metadata: ObjectMeta?,
	val spec: ResourceClaimSpec
)
