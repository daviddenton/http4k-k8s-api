package http4k.k8s.model.io.k8s.api.authorization.v1

import kotlin.String

data class ResourceAttributes(
	val group: String?,
	val name: String?,
	val namespace: String?,
	val resource: String?,
	val subresource: String?,
	val verb: String?,
	val version: String?
)
