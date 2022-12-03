package http4k.k8s.model.io.k8s.api.storage.v1

data class CSINodeSpec(
    val drivers: List<CSINodeDriver>
)
