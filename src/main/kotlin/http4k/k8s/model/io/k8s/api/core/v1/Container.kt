package http4k.k8s.model.io.k8s.api.core.v1

data class Container(
    val args: List<String>?,
    val command: List<String>?,
    val env: List<EnvVar>?,
    val envFrom: List<EnvFromSource>?,
    val image: String?,
    val imagePullPolicy: String?,
    val lifecycle: Lifecycle?,
    val livenessProbe: Probe?,
    val name: String,
    val ports: List<ContainerPort>?,
    val readinessProbe: Probe?,
    val resources: ResourceRequirements?,
    val securityContext: SecurityContext?,
    val startupProbe: Probe?,
    val stdin: Boolean?,
    val stdinOnce: Boolean?,
    val terminationMessagePath: String?,
    val terminationMessagePolicy: String?,
    val tty: Boolean?,
    val volumeDevices: List<VolumeDevice>?,
    val volumeMounts: List<VolumeMount>?,
    val workingDir: String?
)
