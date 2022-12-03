package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class ConfigMapNodeConfigSource(
	val kubeletConfigKey: String,
	val name: String,
	val namespace: String,
	val resourceVersion: String?,
	val uid: String?
)
