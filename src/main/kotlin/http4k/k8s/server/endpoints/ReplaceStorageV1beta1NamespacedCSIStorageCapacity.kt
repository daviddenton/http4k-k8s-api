package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.storage.v1beta1.CSIStorageCapacity
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
 * replace the specified CSIStorageCapacity
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun ReplaceStorageV1beta1NamespacedCSIStorageCapacity(): RoutingHttpHandler {
	val iok8sapistoragev1beta1CSIStorageCapacityLens = Body.auto<CSIStorageCapacity>().toLens()
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities/{name}" bind Method.PUT to { req: Request ->
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapistoragev1beta1CSIStorageCapacity = iok8sapistoragev1beta1CSIStorageCapacityLens(req)
		Response(Status.OK)
			.with(iok8sapistoragev1beta1CSIStorageCapacityLens of TODO())
	}
}
