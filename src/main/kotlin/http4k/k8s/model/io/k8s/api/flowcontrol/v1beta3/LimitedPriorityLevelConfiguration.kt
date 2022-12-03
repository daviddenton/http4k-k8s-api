package http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3

import kotlin.Int

data class LimitedPriorityLevelConfiguration(
	val borrowingLimitPercent: Int?,
	val lendablePercent: Int?,
	val limitResponse: LimitResponse?,
	val nominalConcurrencyShares: Int?
)
