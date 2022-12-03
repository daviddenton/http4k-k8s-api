package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.api.core.v1.PodTemplateSpec
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class DaemonSetSpec(
    val minReadySeconds: Int?,
    val revisionHistoryLimit: Int?,
    val selector: LabelSelector,
    val template: PodTemplateSpec,
    val updateStrategy: DaemonSetUpdateStrategy?
)
