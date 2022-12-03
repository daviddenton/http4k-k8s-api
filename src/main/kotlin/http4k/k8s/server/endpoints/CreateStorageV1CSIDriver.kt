package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.storage.v1.CSIDriver
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Query
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * create a CSIDriver
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateStorageV1CSIDriver(): RoutingHttpHandler {
	val iok8sapistoragev1CSIDriverLens = Body.auto<CSIDriver>().toLens()
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/storage.k8s.io/v1/csidrivers" bind Method.POST to { req: Request ->
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapistoragev1CSIDriver = iok8sapistoragev1CSIDriverLens(req)
		Response(Status.OK)
			.with(iok8sapistoragev1CSIDriverLens of TODO())
	}
}
