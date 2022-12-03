package http4k.k8s.model.io.k8s.api.rbac.v1

import kotlin.String

data class RoleRef(
	val apiGroup: String,
	val kind: String,
	val name: String
)
