package http4k.k8s.model.io.k8s.api.discovery.v1

data class EndpointConditions(
    val ready: Boolean?,
    val serving: Boolean?,
    val terminating: Boolean?
)
