package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class FlowSchema(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: FlowSchemaSpec?,
    val status: FlowSchemaStatus?
)
