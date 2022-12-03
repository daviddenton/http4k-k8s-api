package http4k.k8s.model.io.k8s.api.batch.v1

import http4k.k8s.model.io.k8s.api.core.v1.PodTemplateSpec
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class JobSpec(
    val activeDeadlineSeconds: Int?,
    val backoffLimit: Int?,
    val completionMode: String?,
    val completions: Int?,
    val manualSelector: Boolean?,
    val parallelism: Int?,
    val podFailurePolicy: PodFailurePolicy?,
    val selector: LabelSelector?,
    val `suspend`: Boolean?,
    val template: PodTemplateSpec,
    val ttlSecondsAfterFinished: Int?
)
