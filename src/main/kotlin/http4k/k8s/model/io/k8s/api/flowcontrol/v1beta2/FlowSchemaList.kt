package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class FlowSchemaList(
	val apiVersion: String?,
	val items: List<FlowSchema>,
	val kind: String?,
	val metadata: ListMeta?
)
