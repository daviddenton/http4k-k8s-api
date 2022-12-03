package http4k.k8s.model.io.k8s.api.core.v1

data class Affinity(
    val nodeAffinity: NodeAffinity?,
    val podAffinity: PodAffinity?,
    val podAntiAffinity: PodAntiAffinity?
)
