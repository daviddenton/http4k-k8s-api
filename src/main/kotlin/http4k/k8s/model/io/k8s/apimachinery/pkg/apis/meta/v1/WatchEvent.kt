package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.runtime.RawExtension

data class WatchEvent(
    val `object`: RawExtension,
    val type: String
)
