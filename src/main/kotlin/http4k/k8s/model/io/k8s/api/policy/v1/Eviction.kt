package http4k.k8s.model.io.k8s.api.policy.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class Eviction(
    val apiVersion: String?,
    val deleteOptions: DeleteOptions?,
    val kind: String?,
    val metadata: ObjectMeta?
)
