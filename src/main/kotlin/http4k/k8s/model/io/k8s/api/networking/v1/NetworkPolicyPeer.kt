package http4k.k8s.model.io.k8s.api.networking.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class NetworkPolicyPeer(
	val ipBlock: IPBlock?,
	val namespaceSelector: LabelSelector?,
	val podSelector: LabelSelector?
)
