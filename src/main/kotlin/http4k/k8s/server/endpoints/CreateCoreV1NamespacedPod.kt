package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.core.v1.Pod
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
 * create a Pod
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateCoreV1NamespacedPod(): RoutingHttpHandler {
    val iok8sapicorev1PodLens = Body.auto<Pod>().toLens()
    val namespaceLens = Path.string().of("namespace")
    val prettyLens = Query.string().optional("pretty")
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")

    return "/api/v1/namespaces/{namespace}/pods" bind Method.POST to { req: Request ->
        val namespace = namespaceLens(req)
        val pretty = prettyLens(req)
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val iok8sapicorev1Pod = iok8sapicorev1PodLens(req)
        Response(Status.OK)
            .with(iok8sapicorev1PodLens of TODO())
    }
}
