package http4k.k8s.model.io.k8s.api.authentication.v1alpha1

import http4k.k8s.model.io.k8s.api.authentication.v1.UserInfo

data class SelfSubjectReviewStatus(
	val userInfo: UserInfo?
)
