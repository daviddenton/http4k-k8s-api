package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class FlowSchemaCondition(
    val lastTransitionTime: Time?,
    val message: String?,
    val reason: String?,
    val status: String?,
    val type: String?
)
