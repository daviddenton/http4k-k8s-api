package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int

data class PreferredSchedulingTerm(
	val preference: NodeSelectorTerm,
	val weight: Int
)
