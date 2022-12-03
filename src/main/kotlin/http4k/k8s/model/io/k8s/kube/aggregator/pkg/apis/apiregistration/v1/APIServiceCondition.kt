package http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.String

data class APIServiceCondition(
	val lastTransitionTime: Time?,
	val message: String?,
	val reason: String?,
	val status: String,
	val type: String
)
