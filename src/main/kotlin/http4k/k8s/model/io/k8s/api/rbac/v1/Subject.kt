package http4k.k8s.model.io.k8s.api.rbac.v1

import kotlin.String

data class Subject(
	val apiGroup: String?,
	val kind: String,
	val name: String,
	val namespace: String?
)
