package http4k.k8s.model.io.k8s.api.rbac.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector
import kotlin.collections.List

data class AggregationRule(
	val clusterRoleSelectors: List<LabelSelector>?
)
