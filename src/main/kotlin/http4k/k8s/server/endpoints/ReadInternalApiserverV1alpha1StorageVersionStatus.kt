package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.apiserverinternal.v1alpha1.StorageVersion
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
 * read status of the specified StorageVersion
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadInternalApiserverV1alpha1StorageVersionStatus(): RoutingHttpHandler {
	val iok8sapiapiserverinternalv1alpha1StorageVersionLens = Body.auto<StorageVersion>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")

	return "/apis/internal.apiserver.k8s.io/v1alpha1/storageversions/{name}/status" bind Method.GET to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		Response(Status.OK)
			.with(iok8sapiapiserverinternalv1alpha1StorageVersionLens of TODO())
	}
}
