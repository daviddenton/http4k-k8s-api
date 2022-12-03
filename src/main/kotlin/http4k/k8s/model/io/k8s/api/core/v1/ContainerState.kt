package http4k.k8s.model.io.k8s.api.core.v1

data class ContainerState(
    val running: ContainerStateRunning?,
    val terminated: ContainerStateTerminated?,
    val waiting: ContainerStateWaiting?
)
