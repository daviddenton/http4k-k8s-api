package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

data class ReplicationControllerSpec(
	val minReadySeconds: Int?,
	val replicas: Int?,
	val selector: Map<String, Any>?,
	val template: PodTemplateSpec?
)
