package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class APIGroup(
    val apiVersion: String?,
    val kind: String?,
    val name: String,
    val preferredVersion: GroupVersionForDiscovery?,
    val serverAddressByClientCIDRs: List<ServerAddressByClientCIDR>?,
    val versions: List<GroupVersionForDiscovery>
)
