package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta2

import kotlin.Int

data class LimitedPriorityLevelConfiguration(
	val assuredConcurrencyShares: Int?,
	val borrowingLimitPercent: Int?,
	val lendablePercent: Int?,
	val limitResponse: LimitResponse?
)
