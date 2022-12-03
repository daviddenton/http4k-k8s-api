package http4k.k8s.model.io.k8s.api.batch.v1

import http4k.k8s.model.io.k8s.api.core.v1.ObjectReference
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class CronJobStatus(
    val active: List<ObjectReference>?,
    val lastScheduleTime: Time?,
    val lastSuccessfulTime: Time?
)
