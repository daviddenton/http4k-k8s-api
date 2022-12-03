package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.APIResourceList
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * get available resources
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun GetAppsV1APIResources(): RoutingHttpHandler {
	val iok8sapimachinerypkgapismetav1APIResourceListLens = Body.auto<APIResourceList>().toLens()

	return "/apis/apps/v1/" bind Method.GET to { req: Request ->
		Response(Status.OK)
			.with(iok8sapimachinerypkgapismetav1APIResourceListLens of TODO())
	}
}
