package http4k.k8s.model.io.k8s.api.storage.v1

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class CSIDriverSpec(
	val attachRequired: Boolean?,
	val fsGroupPolicy: String?,
	val podInfoOnMount: Boolean?,
	val requiresRepublish: Boolean?,
	val seLinuxMount: Boolean?,
	val storageCapacity: Boolean?,
	val tokenRequests: List<TokenRequest>?,
	val volumeLifecycleModes: List<String>?
)
