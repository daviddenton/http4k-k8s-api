package http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String

data class APIService(
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val spec: APIServiceSpec?,
	val status: APIServiceStatus?
)
