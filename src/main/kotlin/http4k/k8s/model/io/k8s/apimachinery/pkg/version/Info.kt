package http4k.k8s.model.io.k8s.apimachinery.pkg.version

import kotlin.String

data class Info(
	val buildDate: String,
	val compiler: String,
	val gitCommit: String,
	val gitTreeState: String,
	val gitVersion: String,
	val goVersion: String,
	val major: String,
	val minor: String,
	val platform: String
)
