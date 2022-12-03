package http4k.k8s.model.io.k8s.api.storage.v1beta1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class CSIStorageCapacityList(
	val apiVersion: String?,
	val items: List<CSIStorageCapacity>,
	val kind: String?,
	val metadata: ListMeta?
)
