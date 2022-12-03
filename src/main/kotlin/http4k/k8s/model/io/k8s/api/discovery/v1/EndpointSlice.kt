package http4k.k8s.model.io.k8s.api.discovery.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String
import kotlin.collections.List

data class EndpointSlice(
	val addressType: String,
	val apiVersion: String?,
	val endpoints: List<Endpoint>,
	val kind: String?,
	val metadata: ObjectMeta?,
	val ports: List<EndpointPort>?
)
