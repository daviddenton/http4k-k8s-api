package http4k.k8s.model.io.k8s.api.core.v1

data class LifecycleHandler(
    val exec: ExecAction?,
    val httpGet: HTTPGetAction?,
    val tcpSocket: TCPSocketAction?
)
