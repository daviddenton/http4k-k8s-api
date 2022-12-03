package http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String

data class APIServiceSpec(
	val caBundle: String?,
	val group: String?,
	val groupPriorityMinimum: Int,
	val insecureSkipTLSVerify: Boolean?,
	val service: ServiceReference?,
	val version: String?,
	val versionPriority: Int
)
