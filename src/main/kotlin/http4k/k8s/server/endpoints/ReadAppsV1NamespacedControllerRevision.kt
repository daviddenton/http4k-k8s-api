package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.apps.v1.ControllerRevision
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
 * read the specified ControllerRevision
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadAppsV1NamespacedControllerRevision(): RoutingHttpHandler {
    val iok8sapiappsv1ControllerRevisionLens = Body.auto<ControllerRevision>().toLens()
    val nameLens = Path.string().of("name")
    val namespaceLens = Path.string().of("namespace")
    val prettyLens = Query.string().optional("pretty")

    return "/apis/apps/v1/namespaces/{namespace}/controllerrevisions/{name}" bind Method.GET to { req: Request ->
        val name = nameLens(req)
        val namespace = namespaceLens(req)
        val pretty = prettyLens(req)
        Response(Status.OK)
            .with(iok8sapiappsv1ControllerRevisionLens of TODO())
    }
}
