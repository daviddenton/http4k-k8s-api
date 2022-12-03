package http4k.k8s.server.endpoints

import kotlin.String
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
 * connect DELETE requests to proxy of Service
 * Response:
 * 	* / *
 * 		200 OK
 * 		401 Unauthorized
 */
fun ConnectCoreV1DeleteNamespacedServiceProxyWithPath(): RoutingHttpHandler {
	val connectCoreV1DeleteNamespacedServiceProxyWithPathResponse200Lens = Body.auto<String>().toLens()
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val pathLens = Path.string().of("path")
	val pathQueryLens = Query.string().optional("path")

	return "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" bind Method.DELETE to { req: Request ->
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val path = pathLens(req)
		val pathQuery = pathQueryLens(req)
		Response(Status.OK)
			.with(connectCoreV1DeleteNamespacedServiceProxyWithPathResponse200Lens of TODO())
	}
}
