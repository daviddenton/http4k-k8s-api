package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.storage.v1.StorageClass
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
 * read the specified StorageClass
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadStorageV1StorageClass(): RoutingHttpHandler {
	val iok8sapistoragev1StorageClassLens = Body.auto<StorageClass>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")

	return "/apis/storage.k8s.io/v1/storageclasses/{name}" bind Method.GET to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		Response(Status.OK)
			.with(iok8sapistoragev1StorageClassLens of TODO())
	}
}
