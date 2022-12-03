package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.api.resource.Quantity

data class EmptyDirVolumeSource(
    val medium: String?,
    val sizeLimit: Quantity?
)
