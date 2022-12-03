package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.String
import kotlin.collections.List

data class APIVersions(
	val apiVersion: String?,
	val kind: String?,
	val serverAddressByClientCIDRs: List<ServerAddressByClientCIDR>,
	val versions: List<String>
)
