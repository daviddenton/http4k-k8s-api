package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.core.v1.PersistentVolume
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Patch
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Path
import org.http4k.lens.Query
import org.http4k.lens.boolean
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * partially update status of the specified PersistentVolume
 * Request:
 * 	application/json-patch+json
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun PatchCoreV1PersistentVolumeStatus(): RoutingHttpHandler {
    val iok8sapimachinerypkgapismetav1PatchLens = Body.auto<Patch>().toLens()
    val iok8sapicorev1PersistentVolumeLens = Body.auto<PersistentVolume>().toLens()
    val nameLens = Path.string().of("name")
    val prettyLens = Query.string().optional("pretty")
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")
    val forceLens = Query.boolean().optional("force")

    return "/api/v1/persistentvolumes/{name}/status" bind Method.PATCH to { req: Request ->
        val name = nameLens(req)
        val pretty = prettyLens(req)
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val force = forceLens(req)
        val iok8sapimachinerypkgapismetav1Patch = iok8sapimachinerypkgapismetav1PatchLens(req)
        Response(Status.OK)
            .with(iok8sapicorev1PersistentVolumeLens of TODO())
    }
}
