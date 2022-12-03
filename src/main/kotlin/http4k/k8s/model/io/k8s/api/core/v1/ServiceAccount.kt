package http4k.k8s.model.io.k8s.api.core.v1

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class ServiceAccount(
	val apiVersion: String?,
	val automountServiceAccountToken: Boolean?,
	val imagePullSecrets: List<LocalObjectReference>?,
	val kind: String?,
	val metadata: ObjectMeta?,
	val secrets: List<ObjectReference>?
)
