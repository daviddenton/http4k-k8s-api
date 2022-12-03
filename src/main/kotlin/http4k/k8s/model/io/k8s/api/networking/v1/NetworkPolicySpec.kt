package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector
import kotlin.String
import kotlin.collections.List

data class NetworkPolicySpec(
	val egress: List<NetworkPolicyEgressRule>?,
	val ingress: List<NetworkPolicyIngressRule>?,
	val podSelector: LabelSelector,
	val policyTypes: List<String>?
)
