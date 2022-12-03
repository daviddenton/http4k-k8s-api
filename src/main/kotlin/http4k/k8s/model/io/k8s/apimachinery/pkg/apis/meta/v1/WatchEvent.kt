package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.runtime.RawExtension
import kotlin.String

data class WatchEvent(
	val `object`: RawExtension,
	val type: String
)
