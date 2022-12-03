package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.MicroTime
import kotlin.Int

data class EventSeries(
	val count: Int?,
	val lastObservedTime: MicroTime?
)
