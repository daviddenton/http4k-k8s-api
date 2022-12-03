package http4k.k8s.model.io.k8s.api.core.v1

data class ResourceQuotaSpec(
    val hard: Map<String, Any>?,
    val scopeSelector: ScopeSelector?,
    val scopes: List<String>?
)
