package http4k.k8s.model.io.k8s.api.batch.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta

data class CronJobList(
    val apiVersion: String?,
    val items: List<CronJob>,
    val kind: String?,
    val metadata: ListMeta?
)
