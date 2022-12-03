package http4k.k8s.model.io.k8s.api.autoscaling.v2

import http4k.k8s.model.io.k8s.apimachinery.pkg.api.resource.Quantity

data class MetricTarget(
    val averageUtilization: Int?,
    val averageValue: Quantity?,
    val type: String,
    val `value`: Quantity?
)
