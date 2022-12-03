package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class NodeSystemInfo(
	val architecture: String,
	val bootID: String,
	val containerRuntimeVersion: String,
	val kernelVersion: String,
	val kubeProxyVersion: String,
	val kubeletVersion: String,
	val machineID: String,
	val operatingSystem: String,
	val osImage: String,
	val systemUUID: String
)
