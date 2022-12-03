package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Int
import kotlin.String

data class Status(
	val apiVersion: String?,
	val code: Int?,
	val details: StatusDetails?,
	val kind: String?,
	val message: String?,
	val metadata: ListMeta?,
	val reason: String?,
	val status: String?
)
