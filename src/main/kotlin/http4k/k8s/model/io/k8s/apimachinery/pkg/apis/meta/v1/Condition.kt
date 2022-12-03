package http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1

import kotlin.Int
import kotlin.String

data class Condition(
	val lastTransitionTime: Time,
	val message: String,
	val observedGeneration: Int?,
	val reason: String,
	val status: String,
	val type: String
)
