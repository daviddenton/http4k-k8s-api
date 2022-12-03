package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

import kotlin.String

data class Subject(
	val group: GroupSubject?,
	val kind: String,
	val serviceAccount: ServiceAccountSubject?,
	val user: UserSubject?
)
