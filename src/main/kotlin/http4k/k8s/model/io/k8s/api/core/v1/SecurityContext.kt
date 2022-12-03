package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String

data class SecurityContext(
	val allowPrivilegeEscalation: Boolean?,
	val capabilities: Capabilities?,
	val privileged: Boolean?,
	val procMount: String?,
	val readOnlyRootFilesystem: Boolean?,
	val runAsGroup: Int?,
	val runAsNonRoot: Boolean?,
	val runAsUser: Int?,
	val seLinuxOptions: SELinuxOptions?,
	val seccompProfile: SeccompProfile?,
	val windowsOptions: WindowsSecurityContextOptions?
)
