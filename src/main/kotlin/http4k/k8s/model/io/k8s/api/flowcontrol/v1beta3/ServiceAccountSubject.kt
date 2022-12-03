package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

import kotlin.String

data class ServiceAccountSubject(
	val name: String,
	val namespace: String
)
