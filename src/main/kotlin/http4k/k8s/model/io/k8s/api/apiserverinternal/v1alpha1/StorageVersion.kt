package http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class StorageVersion(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: StorageVersionSpec,
    val status: StorageVersionStatus
)
