package http4k.k8s.model.io.k8s.api.resource.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class PodSchedulingList(
	val apiVersion: String?,
	val items: List<PodScheduling>,
	val kind: String?,
	val metadata: ListMeta?
)
