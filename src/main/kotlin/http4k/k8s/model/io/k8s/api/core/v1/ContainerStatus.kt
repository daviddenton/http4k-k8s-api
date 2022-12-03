package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String

data class ContainerStatus(
	val containerID: String?,
	val image: String,
	val imageID: String,
	val lastState: ContainerState?,
	val name: String,
	val ready: Boolean,
	val restartCount: Int,
	val started: Boolean?,
	val state: ContainerState?
)
