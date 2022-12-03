package http4k.k8s.model.io.k8s.api.autoscaling.v2

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector
import kotlin.String

data class MetricIdentifier(
	val name: String,
	val selector: LabelSelector?
)
