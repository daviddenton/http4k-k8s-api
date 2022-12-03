package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

data class Secret(
	val apiVersion: String?,
	val `data`: Map<String, Any>?,
	val immutable: Boolean?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val stringData: Map<String, Any>?,
	val type: String?
)
