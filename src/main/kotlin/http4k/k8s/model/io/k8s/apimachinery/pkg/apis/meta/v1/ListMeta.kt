package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Int
import kotlin.String

data class ListMeta(
	val `continue`: String?,
	val remainingItemCount: Int?,
	val resourceVersion: String?,
	val selfLink: String?
)
