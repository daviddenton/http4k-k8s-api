package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Status
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.with
import org.http4k.format.Jackson
import org.http4k.format.Jackson.auto
import org.http4k.lens.Path
import org.http4k.lens.Query
import org.http4k.lens.boolean
import org.http4k.lens.int
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * delete collection of Endpoints
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun DeleteCoreV1CollectionNamespacedEndpoints(): RoutingHttpHandler {
	val iok8sapimachinerypkgapismetav1DeleteOptionsLens = Body.auto<DeleteOptions>().toLens()
	val iok8sapimachinerypkgapismetav1StatusLens = Body.auto<Status>().toLens()
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")
	val continueLens = Query.string().optional("continue")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldSelectorLens = Query.string().optional("fieldSelector")
	val gracePeriodSecondsLens = Query.int().optional("gracePeriodSeconds")
	val labelSelectorLens = Query.string().optional("labelSelector")
	val limitLens = Query.int().optional("limit")
	val orphanDependentsLens = Query.boolean().optional("orphanDependents")
	val propagationPolicyLens = Query.string().optional("propagationPolicy")
	val resourceVersionLens = Query.string().optional("resourceVersion")
	val resourceVersionMatchLens = Query.string().optional("resourceVersionMatch")
	val timeoutSecondsLens = Query.int().optional("timeoutSeconds")

	return "/api/v1/namespaces/{namespace}/endpoints" bind Method.DELETE to { req: Request ->
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val `continue` = continueLens(req)
		val dryRun = dryRunLens(req)
		val fieldSelector = fieldSelectorLens(req)
		val gracePeriodSeconds = gracePeriodSecondsLens(req)
		val labelSelector = labelSelectorLens(req)
		val limit = limitLens(req)
		val orphanDependents = orphanDependentsLens(req)
		val propagationPolicy = propagationPolicyLens(req)
		val resourceVersion = resourceVersionLens(req)
		val resourceVersionMatch = resourceVersionMatchLens(req)
		val timeoutSeconds = timeoutSecondsLens(req)
		val iok8sapimachinerypkgapismetav1DeleteOptions = iok8sapimachinerypkgapismetav1DeleteOptionsLens(req)
		Response(org.http4k.core.Status.OK)
			.with(iok8sapimachinerypkgapismetav1StatusLens of TODO())
	}
}
