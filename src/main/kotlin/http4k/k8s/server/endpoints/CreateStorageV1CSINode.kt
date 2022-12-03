package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.storage.v1.CSINode
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Query
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * create a CSINode
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateStorageV1CSINode(): RoutingHttpHandler {
    val iok8sapistoragev1CSINodeLens = Body.auto<CSINode>().toLens()
    val prettyLens = Query.string().optional("pretty")
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")

    return "/apis/storage.k8s.io/v1/csinodes" bind Method.POST to { req: Request ->
        val pretty = prettyLens(req)
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val iok8sapistoragev1CSINode = iok8sapistoragev1CSINodeLens(req)
        Response(Status.OK)
            .with(iok8sapistoragev1CSINodeLens of TODO())
    }
}
