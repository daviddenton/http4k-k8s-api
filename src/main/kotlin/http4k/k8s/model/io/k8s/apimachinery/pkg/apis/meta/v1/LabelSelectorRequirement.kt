package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class LabelSelectorRequirement(
    val key: String,
    val `operator`: String,
    val values: List<String>?
)
