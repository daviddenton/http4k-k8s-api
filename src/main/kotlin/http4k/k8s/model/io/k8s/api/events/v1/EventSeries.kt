package http4k.k8s.model.io.k8s.api.events.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.MicroTime

data class EventSeries(
    val count: Int,
    val lastObservedTime: MicroTime
)
