package http4k.k8s.model.io.k8s.api.authorization.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta

data class SelfSubjectRulesReview(
    val apiVersion: String?,
    val kind: String?,
    val metadata: ObjectMeta?,
    val spec: SelfSubjectRulesReviewSpec,
    val status: SubjectRulesReviewStatus?
)
