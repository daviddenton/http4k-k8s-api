package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class LocalVolumeSource(
	val fsType: String?,
	val path: String
)