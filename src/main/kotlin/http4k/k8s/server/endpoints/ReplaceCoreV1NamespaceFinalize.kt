package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.core.v1.Namespace
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
 * replace finalize of the specified Namespace
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun ReplaceCoreV1NamespaceFinalize(): RoutingHttpHandler {
    val iok8sapicorev1NamespaceLens = Body.auto<Namespace>().toLens()
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")
    val nameLens = Path.string().of("name")
    val prettyLens = Query.string().optional("pretty")

    return "/api/v1/namespaces/{name}/finalize" bind Method.PUT to { req: Request ->
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val name = nameLens(req)
        val pretty = prettyLens(req)
        val iok8sapicorev1Namespace = iok8sapicorev1NamespaceLens(req)
        Response(Status.OK)
            .with(iok8sapicorev1NamespaceLens of TODO())
    }
}
