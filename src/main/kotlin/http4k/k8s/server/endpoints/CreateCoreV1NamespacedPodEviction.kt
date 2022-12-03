package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.policy.v1.Eviction
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Path
import org.http4k.lens.Query
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * create eviction of a Pod
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateCoreV1NamespacedPodEviction(): RoutingHttpHandler {
	val iok8sapipolicyv1EvictionLens = Body.auto<Eviction>().toLens()
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")

	return "/api/v1/namespaces/{namespace}/pods/{name}/eviction" bind Method.POST to { req: Request ->
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val iok8sapipolicyv1Eviction = iok8sapipolicyv1EvictionLens(req)
		Response(Status.OK)
			.with(iok8sapipolicyv1EvictionLens of TODO())
	}
}
