package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class IngressClassList(
	val apiVersion: String?,
	val items: List<IngressClass>,
	val kind: String?,
	val metadata: ListMeta?
)
