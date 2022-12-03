package http4k.k8s.model.io.k8s.api.coordination.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.MicroTime

data class LeaseSpec(
    val acquireTime: MicroTime?,
    val holderIdentity: String?,
    val leaseDurationSeconds: Int?,
    val leaseTransitions: Int?,
    val renewTime: MicroTime?
)
