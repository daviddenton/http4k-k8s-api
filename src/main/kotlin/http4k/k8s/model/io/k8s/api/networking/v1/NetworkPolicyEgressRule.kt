package http4k.k8s.model.io.k8s.api.networking.v1

import kotlin.collections.List

data class NetworkPolicyEgressRule(
	val ports: List<NetworkPolicyPort>?,
	val to: List<NetworkPolicyPeer>?
)
