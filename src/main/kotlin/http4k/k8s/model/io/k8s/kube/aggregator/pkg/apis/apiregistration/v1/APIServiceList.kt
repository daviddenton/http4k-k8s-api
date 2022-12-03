package http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class APIServiceList(
	val apiVersion: String?,
	val items: List<APIService>,
	val kind: String?,
	val metadata: ListMeta?
)
