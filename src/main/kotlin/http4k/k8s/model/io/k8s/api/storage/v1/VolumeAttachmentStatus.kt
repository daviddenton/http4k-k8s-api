package http4k.k8s.model.io.k8s.api.storage.v1

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

data class VolumeAttachmentStatus(
	val attachError: VolumeError?,
	val attached: Boolean,
	val attachmentMetadata: Map<String, Any>?,
	val detachError: VolumeError?
)
