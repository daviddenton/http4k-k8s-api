package http4k.k8s.model.io.k8s.api.autoscaling.v2

import http4k.k8s.model.io.k8s.apimachinery.pkg.api.resource.Quantity

data class MetricValueStatus(
    val averageUtilization: Int?,
    val averageValue: Quantity?,
    val `value`: Quantity?
)
