package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.String

data class WindowsSecurityContextOptions(
	val gmsaCredentialSpec: String?,
	val gmsaCredentialSpecName: String?,
	val hostProcess: Boolean?,
	val runAsUserName: String?
)
