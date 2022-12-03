package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.kube.aggregator.pkg.apis.apiregistration.v1.APIService
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
 * read the specified APIService
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadApiregistrationV1APIService(): RoutingHttpHandler {
	val iok8skubeaggregatorpkgapisapiregistrationv1APIServiceLens = Body.auto<APIService>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")

	return "/apis/apiregistration.k8s.io/v1/apiservices/{name}" bind Method.GET to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		Response(Status.OK)
			.with(iok8skubeaggregatorpkgapisapiregistrationv1APIServiceLens of TODO())
	}
}
