package http4k.k8s.model.io.k8s.api.storage.v1

import http4k.k8s.model.io.k8s.api.core.v1.PersistentVolumeSpec

data class VolumeAttachmentSource(
    val inlineVolumeSpec: PersistentVolumeSpec?,
    val persistentVolumeName: String?
)
