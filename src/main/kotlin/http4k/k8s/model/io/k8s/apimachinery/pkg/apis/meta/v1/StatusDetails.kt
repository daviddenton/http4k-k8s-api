package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class StatusDetails(
	val causes: List<StatusCause>?,
	val group: String?,
	val kind: String?,
	val name: String?,
	val retryAfterSeconds: Int?,
	val uid: String?
)
