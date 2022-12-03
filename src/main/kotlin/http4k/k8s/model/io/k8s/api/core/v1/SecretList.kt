package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class SecretList(
	val apiVersion: String?,
	val items: List<Secret>,
	val kind: String?,
	val metadata: ListMeta?
)
