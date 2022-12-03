package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.String
import kotlin.collections.List

data class APIResourceList(
	val apiVersion: String?,
	val groupVersion: String,
	val kind: String?,
	val resources: List<APIResource>
)
