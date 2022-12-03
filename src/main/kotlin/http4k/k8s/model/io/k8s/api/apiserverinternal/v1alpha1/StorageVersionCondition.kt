package http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Time

data class StorageVersionCondition(
    val lastTransitionTime: Time?,
    val message: String?,
    val observedGeneration: Int?,
    val reason: String,
    val status: String,
    val type: String
)
