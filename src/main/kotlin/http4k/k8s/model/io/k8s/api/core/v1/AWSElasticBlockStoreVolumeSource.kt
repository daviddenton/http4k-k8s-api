package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.Boolean
import kotlin.Int
import kotlin.String

data class AWSElasticBlockStoreVolumeSource(
	val fsType: String?,
	val partition: Int?,
	val readOnly: Boolean?,
	val volumeID: String
)
