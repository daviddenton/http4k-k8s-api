package http4k.k8s.server.endpoints

import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Path
import org.http4k.lens.Query
import org.http4k.lens.int
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * connect GET requests to portforward of Pod
 * Response:
 * 	* / *
 * 		200 OK
 * 		401 Unauthorized
 */
fun ConnectCoreV1GetNamespacedPodPortforward(): RoutingHttpHandler {
    val connectCoreV1GetNamespacedPodPortforwardResponse200Lens = Body.auto<String>().toLens()
    val nameLens = Path.string().of("name")
    val namespaceLens = Path.string().of("namespace")
    val portsLens = Query.int().optional("ports")

    return "/api/v1/namespaces/{namespace}/pods/{name}/portforward" bind Method.GET to { req: Request ->
        val name = nameLens(req)
        val namespace = namespaceLens(req)
        val ports = portsLens(req)
        Response(Status.OK)
            .with(connectCoreV1GetNamespacedPodPortforwardResponse200Lens of TODO())
    }
}
