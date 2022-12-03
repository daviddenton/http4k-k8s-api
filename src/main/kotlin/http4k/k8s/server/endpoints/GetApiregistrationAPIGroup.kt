package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.APIGroup
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
 * get information of a group
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun GetApiregistrationAPIGroup(): RoutingHttpHandler {
    val iok8sapimachinerypkgapismetav1APIGroupLens = Body.auto<APIGroup>().toLens()

    return "/apis/apiregistration.k8s.io/" bind Method.GET to { req: Request ->
        Response(Status.OK)
            .with(iok8sapimachinerypkgapismetav1APIGroupLens of TODO())
    }
}
