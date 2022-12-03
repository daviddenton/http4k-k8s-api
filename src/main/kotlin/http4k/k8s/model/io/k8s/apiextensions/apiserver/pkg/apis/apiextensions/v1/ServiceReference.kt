package http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1

import kotlin.Int
import kotlin.String

data class ServiceReference(
	val name: String,
	val namespace: String,
	val path: String?,
	val port: Int?
)
