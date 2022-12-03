package http4k.k8s.model.io.k8s.api.node.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class RuntimeClass(
    val apiVersion: String?,
    val handler: String,
    val kind: String?,
    val metadata: ObjectMeta?,
    val overhead: Overhead?,
    val scheduling: Scheduling?
)
