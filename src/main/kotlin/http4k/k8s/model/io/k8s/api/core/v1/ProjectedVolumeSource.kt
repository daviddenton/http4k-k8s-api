package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int
import kotlin.collections.List

data class ProjectedVolumeSource(
	val defaultMode: Int?,
	val sources: List<VolumeProjection>?
)
