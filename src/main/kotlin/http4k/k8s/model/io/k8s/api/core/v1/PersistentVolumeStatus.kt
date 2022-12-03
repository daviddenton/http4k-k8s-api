package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class PersistentVolumeStatus(
	val message: String?,
	val phase: String?,
	val reason: String?
)
