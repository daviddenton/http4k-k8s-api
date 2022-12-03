package http4k.k8s.model.io.k8s.api.rbac.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String
import kotlin.collections.List

data class ClusterRole(
	val aggregationRule: AggregationRule?,
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val rules: List<PolicyRule>?
)
