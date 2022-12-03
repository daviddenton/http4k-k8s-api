package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta
import kotlin.String
import kotlin.collections.List

data class DeploymentList(
	val apiVersion: String?,
	val items: List<Deployment>,
	val kind: String?,
	val metadata: ListMeta?
)
