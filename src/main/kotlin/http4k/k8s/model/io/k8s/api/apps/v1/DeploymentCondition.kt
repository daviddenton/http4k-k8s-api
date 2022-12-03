package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class DeploymentCondition(
    val lastTransitionTime: Time?,
    val lastUpdateTime: Time?,
    val message: String?,
    val reason: String?,
    val status: String,
    val type: String
)
