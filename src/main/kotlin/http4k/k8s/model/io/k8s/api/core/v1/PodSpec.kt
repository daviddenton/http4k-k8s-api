package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

data class PodSpec(
	val activeDeadlineSeconds: Int?,
	val affinity: Affinity?,
	val automountServiceAccountToken: Boolean?,
	val containers: List<Container>,
	val dnsConfig: PodDNSConfig?,
	val dnsPolicy: String?,
	val enableServiceLinks: Boolean?,
	val ephemeralContainers: List<EphemeralContainer>?,
	val hostAliases: List<HostAlias>?,
	val hostIPC: Boolean?,
	val hostNetwork: Boolean?,
	val hostPID: Boolean?,
	val hostUsers: Boolean?,
	val hostname: String?,
	val imagePullSecrets: List<LocalObjectReference>?,
	val initContainers: List<Container>?,
	val nodeName: String?,
	val nodeSelector: Map<String, Any>?,
	val os: PodOS?,
	val overhead: Map<String, Any>?,
	val preemptionPolicy: String?,
	val priority: Int?,
	val priorityClassName: String?,
	val readinessGates: List<PodReadinessGate>?,
	val resourceClaims: List<PodResourceClaim>?,
	val restartPolicy: String?,
	val runtimeClassName: String?,
	val schedulerName: String?,
	val schedulingGates: List<PodSchedulingGate>?,
	val securityContext: PodSecurityContext?,
	val serviceAccount: String?,
	val serviceAccountName: String?,
	val setHostnameAsFQDN: Boolean?,
	val shareProcessNamespace: Boolean?,
	val subdomain: String?,
	val terminationGracePeriodSeconds: Int?,
	val tolerations: List<Toleration>?,
	val topologySpreadConstraints: List<TopologySpreadConstraint>?,
	val volumes: List<Volume>?
)
