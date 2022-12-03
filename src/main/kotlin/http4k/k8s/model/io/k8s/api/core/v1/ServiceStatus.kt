package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Condition
import kotlin.collections.List

data class ServiceStatus(
	val conditions: List<Condition>?,
	val loadBalancer: LoadBalancerStatus?
)
