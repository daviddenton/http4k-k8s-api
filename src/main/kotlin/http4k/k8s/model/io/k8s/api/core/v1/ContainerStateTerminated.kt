package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.Int
import kotlin.String

data class ContainerStateTerminated(
	val containerID: String?,
	val exitCode: Int,
	val finishedAt: Time?,
	val message: String?,
	val reason: String?,
	val signal: Int?,
	val startedAt: Time?
)
