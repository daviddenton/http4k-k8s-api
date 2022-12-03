package http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1

import kotlin.collections.List

data class APIServiceStatus(
	val conditions: List<APIServiceCondition>?
)
