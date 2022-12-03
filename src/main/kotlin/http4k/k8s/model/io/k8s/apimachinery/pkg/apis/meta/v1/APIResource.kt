package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class APIResource(
	val categories: List<String>?,
	val group: String?,
	val kind: String,
	val name: String,
	val namespaced: Boolean,
	val shortNames: List<String>?,
	val singularName: String,
	val storageVersionHash: String?,
	val verbs: List<String>,
	val version: String?
)
