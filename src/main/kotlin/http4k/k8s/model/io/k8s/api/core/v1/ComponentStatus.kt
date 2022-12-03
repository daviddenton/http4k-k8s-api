package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String
import kotlin.collections.List

data class ComponentStatus(
	val apiVersion: String?,
	val conditions: List<ComponentCondition>?,
	val kind: String?,
	val metadata: ObjectMeta?
)