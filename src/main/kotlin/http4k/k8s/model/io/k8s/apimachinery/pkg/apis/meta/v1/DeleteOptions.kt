package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class DeleteOptions(
	val apiVersion: String?,
	val dryRun: List<String>?,
	val gracePeriodSeconds: Int?,
	val kind: String?,
	val orphanDependents: Boolean?,
	val preconditions: Preconditions?,
	val propagationPolicy: String?
)
