package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.MicroTime
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class Event(
    val action: String?,
    val apiVersion: String?,
    val count: Int?,
    val eventTime: MicroTime?,
    val firstTimestamp: Time?,
    val involvedObject: ObjectReference,
    val kind: String?,
    val lastTimestamp: Time?,
    val message: String?,
    val metadata: ObjectMeta,
    val reason: String?,
    val related: ObjectReference?,
    val reportingComponent: String?,
    val reportingInstance: String?,
    val series: EventSeries?,
    val source: EventSource?,
    val type: String?
)
