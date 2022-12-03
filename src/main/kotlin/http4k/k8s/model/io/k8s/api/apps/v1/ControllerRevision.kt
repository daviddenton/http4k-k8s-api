package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import http4k.k8s.model.io.k8s.apimachinery.pkg.runtime.RawExtension

data class ControllerRevision(
    val apiVersion: String?,
    val `data`: RawExtension?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val revision: Int
)
