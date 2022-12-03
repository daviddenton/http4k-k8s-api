package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.String

data class Taint(
	val effect: String,
	val key: String,
	val timeAdded: Time?,
	val `value`: String?
)
