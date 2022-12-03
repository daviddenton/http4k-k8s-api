package http4k.k8s.model.io.k8s.api.core.v1

data class ResourceQuotaStatus(
    val hard: Map<String, Any>?,
    val used: Map<String, Any>?
)
