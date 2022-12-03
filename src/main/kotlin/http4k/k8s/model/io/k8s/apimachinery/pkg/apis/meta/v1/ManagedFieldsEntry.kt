package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.String

data class ManagedFieldsEntry(
	val apiVersion: String?,
	val fieldsType: String?,
	val fieldsV1: FieldsV1?,
	val manager: String?,
	val operation: String?,
	val subresource: String?,
	val time: Time?
)
