package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.String

data class Preconditions(
	val resourceVersion: String?,
	val uid: String?
)
