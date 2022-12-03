package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.apimachinery.pkg.version.Info
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
 * get the code version
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun GetCodeVersion(): RoutingHttpHandler {
	val iok8sapimachinerypkgversionInfoLens = Body.auto<Info>().toLens()

	return "/version/" bind Method.GET to { req: Request ->
		Response(Status.OK)
			.with(iok8sapimachinerypkgversionInfoLens of TODO())
	}
}
