package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

data class ObjectMeta(
    val annotations: Map<String, Any>?,
    val creationTimestamp: Time?,
    val deletionGracePeriodSeconds: Int?,
    val deletionTimestamp: Time?,
    val finalizers: List<String>?,
    val generateName: String?,
    val generation: Int?,
    val labels: Map<String, Any>?,
    val managedFields: List<ManagedFieldsEntry>?,
    val name: String?,
    val namespace: String?,
    val ownerReferences: List<OwnerReference>?,
    val resourceVersion: String?,
    val selfLink: String?,
    val uid: String?
)
