package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1.StorageVersion
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
 * create a StorageVersion
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateInternalApiserverV1alpha1StorageVersion(): RoutingHttpHandler {
	val iok8sapiapiserverinternalv1alpha1StorageVersionLens = Body.auto<StorageVersion>().toLens()
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/internal.apiserver.k8s.io/v1alpha1/storageversions" bind Method.POST to { req: Request ->
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapiapiserverinternalv1alpha1StorageVersion = iok8sapiapiserverinternalv1alpha1StorageVersionLens(req)
		Response(Status.OK)
			.with(iok8sapiapiserverinternalv1alpha1StorageVersionLens of TODO())
	}
}
