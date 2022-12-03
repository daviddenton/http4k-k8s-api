package http4k.k8s.model.io.k8s.api.events.v1

import http4k.k8s.model.io.k8s.api.core.v1.EventSource
import http4k.k8s.model.io.k8s.api.core.v1.ObjectReference
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.MicroTime
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time
import kotlin.Int
import kotlin.String

data class Event(
	val action: String?,
	val apiVersion: String?,
	val deprecatedCount: Int?,
	val deprecatedFirstTimestamp: Time?,
	val deprecatedLastTimestamp: Time?,
	val deprecatedSource: EventSource?,
	val eventTime: MicroTime,
	val kind: String?,
	val metadata: ObjectMeta?,
	val note: String?,
	val reason: String?,
	val regarding: ObjectReference?,
	val related: ObjectReference?,
	val reportingController: String?,
	val reportingInstance: String?,
	val series: EventSeries?,
	val type: String?
)
