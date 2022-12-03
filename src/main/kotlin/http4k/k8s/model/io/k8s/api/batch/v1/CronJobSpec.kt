package http4k.k8s.model.io.k8s.api.batch.v1

data class CronJobSpec(
    val concurrencyPolicy: String?,
    val failedJobsHistoryLimit: Int?,
    val jobTemplate: JobTemplateSpec,
    val schedule: String,
    val startingDeadlineSeconds: Int?,
    val successfulJobsHistoryLimit: Int?,
    val `suspend`: Boolean?,
    val timeZone: String?
)
