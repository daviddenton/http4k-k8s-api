package http4k.k8s.model.io.k8s.api.batch.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class JobStatus(
    val active: Int?,
    val completedIndexes: String?,
    val completionTime: Time?,
    val conditions: List<JobCondition>?,
    val failed: Int?,
    val ready: Int?,
    val startTime: Time?,
    val succeeded: Int?,
    val uncountedTerminatedPods: UncountedTerminatedPods?
)
