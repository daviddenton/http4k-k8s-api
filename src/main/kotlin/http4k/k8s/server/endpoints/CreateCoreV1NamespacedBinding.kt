package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.core.v1.Binding
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
 * create a Binding
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateCoreV1NamespacedBinding(): RoutingHttpHandler {
	val iok8sapicorev1BindingLens = Body.auto<Binding>().toLens()
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")

	return "/api/v1/namespaces/{namespace}/bindings" bind Method.POST to { req: Request ->
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val iok8sapicorev1Binding = iok8sapicorev1BindingLens(req)
		Response(Status.OK)
			.with(iok8sapicorev1BindingLens of TODO())
	}
}
