package http4k.k8s.model.io.k8s.api.storage.v1beta1

import http4k.k8s.model.io.k8s.apimachinery.pkg.api.resource.Quantity
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class CSIStorageCapacity(
    val apiVersion: String?,
    val capacity: Quantity?,
    val kind: String?,
    val maximumVolumeSize: Quantity?,
    val metadata: ObjectMeta?,
    val nodeTopology: LabelSelector?,
    val storageClassName: String
)
