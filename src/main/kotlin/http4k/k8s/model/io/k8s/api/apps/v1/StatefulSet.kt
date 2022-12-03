package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class StatefulSet(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: StatefulSetSpec?,
    val status: StatefulSetStatus?
)
