package http4k.k8s.model.io.k8s.api.core.v1

data class EnvFromSource(
    val configMapRef: ConfigMapEnvSource?,
    val prefix: String?,
    val secretRef: SecretEnvSource?
)
