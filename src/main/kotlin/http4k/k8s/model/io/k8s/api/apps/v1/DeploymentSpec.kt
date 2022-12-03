package http4k.k8s.model.io.k8s.api.apps.v1

import http4k.k8s.model.io.k8s.api.core.v1.PodTemplateSpec
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector
import kotlin.Boolean
import kotlin.Int

data class DeploymentSpec(
	val minReadySeconds: Int?,
	val paused: Boolean?,
	val progressDeadlineSeconds: Int?,
	val replicas: Int?,
	val revisionHistoryLimit: Int?,
	val selector: LabelSelector,
	val strategy: DeploymentStrategy?,
	val template: PodTemplateSpec
)
