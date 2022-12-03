package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.api.core.v1.PersistentVolumeClaim
import http4k.k8s.model.io.k8s.api.core.v1.PodTemplateSpec
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector

data class StatefulSetSpec(
    val minReadySeconds: Int?,
    val ordinals: StatefulSetOrdinals?,
    val persistentVolumeClaimRetentionPolicy: StatefulSetPersistentVolumeClaimRetentionPolicy?,
    val podManagementPolicy: String?,
    val replicas: Int?,
    val revisionHistoryLimit: Int?,
    val selector: LabelSelector,
    val serviceName: String,
    val template: PodTemplateSpec,
    val updateStrategy: StatefulSetUpdateStrategy?,
    val volumeClaimTemplates: List<PersistentVolumeClaim>?
)
