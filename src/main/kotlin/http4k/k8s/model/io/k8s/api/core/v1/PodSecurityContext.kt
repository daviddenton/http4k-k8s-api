package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

data class PodSecurityContext(
	val fsGroup: Int?,
	val fsGroupChangePolicy: String?,
	val runAsGroup: Int?,
	val runAsNonRoot: Boolean?,
	val runAsUser: Int?,
	val seLinuxOptions: SELinuxOptions?,
	val seccompProfile: SeccompProfile?,
	val supplementalGroups: List<Int>?,
	val sysctls: List<Sysctl>?,
	val windowsOptions: WindowsSecurityContextOptions?
)
