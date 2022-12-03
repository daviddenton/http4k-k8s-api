package http4k.k8s.server.endpoints

import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * Response:
 * 	application/json
 * 		401 Unauthorized
 */
fun LogFileListHandler(): RoutingHttpHandler {

	return "/logs/" bind Method.GET to { req: Request ->
		Response(Status.OK)
	}
}
