package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.collections.List

data class NodeAffinity(
	val preferredDuringSchedulingIgnoredDuringExecution: List<PreferredSchedulingTerm>?,
	val requiredDuringSchedulingIgnoredDuringExecution: NodeSelector?
)
