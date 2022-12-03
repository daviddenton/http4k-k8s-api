package http4k.k8s.model.io.k8s.api.scheduling.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class PriorityClass(
    val apiVersion: String?,
    val description: String?,
    val globalDefault: Boolean?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val preemptionPolicy: String?,
    val `value`: Int
)
