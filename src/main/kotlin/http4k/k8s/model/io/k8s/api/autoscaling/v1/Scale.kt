package http4k.k8s.model.io.k8s.api.autoscaling.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.String

data class Scale(
	val apiVersion: String?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val spec: ScaleSpec?,
	val status: ScaleStatus?
)
