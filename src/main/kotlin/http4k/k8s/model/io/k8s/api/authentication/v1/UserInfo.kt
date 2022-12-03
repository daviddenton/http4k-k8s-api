package http4k.k8s.model.io.k8s.api.authentication.v1

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class UserInfo(
	val extra: Map<String, Any>?,
	val groups: List<String>?,
	val uid: String?,
	val username: String?
)
