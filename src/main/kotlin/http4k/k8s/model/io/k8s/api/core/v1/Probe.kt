package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Int

data class Probe(
	val exec: ExecAction?,
	val failureThreshold: Int?,
	val grpc: GRPCAction?,
	val httpGet: HTTPGetAction?,
	val initialDelaySeconds: Int?,
	val periodSeconds: Int?,
	val successThreshold: Int?,
	val tcpSocket: TCPSocketAction?,
	val terminationGracePeriodSeconds: Int?,
	val timeoutSeconds: Int?
)
