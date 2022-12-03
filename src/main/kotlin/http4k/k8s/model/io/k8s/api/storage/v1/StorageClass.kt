package http4k.k8s.model.io.k8s.api.storage.v1

import http4k.k8s.model.io.k8s.api.core.v1.TopologySelectorTerm
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class StorageClass(
	val allowVolumeExpansion: Boolean?,
	val allowedTopologies: List<TopologySelectorTerm>?,
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val mountOptions: List<String>?,
	val parameters: Map<String, Any>?,
	val provisioner: String,
	val reclaimPolicy: String?,
	val volumeBindingMode: String?
)
