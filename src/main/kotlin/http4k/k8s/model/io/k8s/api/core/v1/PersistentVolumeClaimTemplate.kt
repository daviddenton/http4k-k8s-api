package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class PersistentVolumeClaimTemplate(
    val metadata: ObjectMeta?,
    val spec: PersistentVolumeClaimSpec
)
