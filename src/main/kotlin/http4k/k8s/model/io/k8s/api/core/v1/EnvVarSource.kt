package http4k.k8s.model.io.k8s.api.core.v1

data class EnvVarSource(
	val configMapKeyRef: ConfigMapKeySelector?,
	val fieldRef: ObjectFieldSelector?,
	val resourceFieldRef: ResourceFieldSelector?,
	val secretKeyRef: SecretKeySelector?
)
