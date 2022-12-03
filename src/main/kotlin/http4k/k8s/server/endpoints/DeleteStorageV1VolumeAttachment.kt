package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.storage.v1.VolumeAttachment
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson
import org.http4k.format.Jackson.auto
import org.http4k.lens.Path
import org.http4k.lens.Query
import org.http4k.lens.boolean
import org.http4k.lens.int
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * delete a VolumeAttachment
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun DeleteStorageV1VolumeAttachment(): RoutingHttpHandler {
	val iok8sapimachinerypkgapismetav1DeleteOptionsLens = Body.auto<DeleteOptions>().toLens()
	val iok8sapistoragev1VolumeAttachmentLens = Body.auto<VolumeAttachment>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val gracePeriodSecondsLens = Query.int().optional("gracePeriodSeconds")
	val orphanDependentsLens = Query.boolean().optional("orphanDependents")
	val propagationPolicyLens = Query.string().optional("propagationPolicy")

	return "/apis/storage.k8s.io/v1/volumeattachments/{name}" bind Method.DELETE to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val gracePeriodSeconds = gracePeriodSecondsLens(req)
		val orphanDependents = orphanDependentsLens(req)
		val propagationPolicy = propagationPolicyLens(req)
		val iok8sapimachinerypkgapismetav1DeleteOptions = iok8sapimachinerypkgapismetav1DeleteOptionsLens(req)
		Response(Status.OK)
			.with(iok8sapistoragev1VolumeAttachmentLens of TODO())
	}
}
