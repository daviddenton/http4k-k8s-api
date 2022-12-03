package http4k.k8s.model.io.k8s.api.core.v1

data class VolumeProjection(
	val configMap: ConfigMapProjection?,
	val downwardAPI: DownwardAPIProjection?,
	val secret: SecretProjection?,
	val serviceAccountToken: ServiceAccountTokenProjection?
)
