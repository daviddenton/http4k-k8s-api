package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.api.core.v1.PodTemplateSpec
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class ReplicaSetSpec(
    val minReadySeconds: Int?,
    val replicas: Int?,
    val selector: LabelSelector,
    val template: PodTemplateSpec?
)
