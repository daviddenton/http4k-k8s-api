package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.WatchEvent
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Query
import org.http4k.lens.boolean
import org.http4k.lens.int
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * watch individual changes to a list of ValidatingWebhookConfiguration. deprecated: use the 'watch'
 * parameter with a list operation instead.
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun WatchAdmissionregistrationV1ValidatingWebhookConfigurationList(): RoutingHttpHandler {
    val iok8sapimachinerypkgapismetav1WatchEventLens = Body.auto<WatchEvent>().toLens()
    val allowWatchBookmarksLens = Query.boolean().optional("allowWatchBookmarks")
    val continueLens = Query.string().optional("continue")
    val fieldSelectorLens = Query.string().optional("fieldSelector")
    val labelSelectorLens = Query.string().optional("labelSelector")
    val limitLens = Query.int().optional("limit")
    val prettyLens = Query.string().optional("pretty")
    val resourceVersionLens = Query.string().optional("resourceVersion")
    val resourceVersionMatchLens = Query.string().optional("resourceVersionMatch")
    val timeoutSecondsLens = Query.int().optional("timeoutSeconds")
    val watchLens = Query.boolean().optional("watch")

    return "/apis/admissionregistration.k8s.io/v1/watch/validatingwebhookconfigurations" bind Method.GET to { req: Request ->
        val allowWatchBookmarks = allowWatchBookmarksLens(req)
        val `continue` = continueLens(req)
        val fieldSelector = fieldSelectorLens(req)
        val labelSelector = labelSelectorLens(req)
        val limit = limitLens(req)
        val pretty = prettyLens(req)
        val resourceVersion = resourceVersionLens(req)
        val resourceVersionMatch = resourceVersionMatchLens(req)
        val timeoutSeconds = timeoutSecondsLens(req)
        val watch = watchLens(req)
        Response(Status.OK)
            .with(iok8sapimachinerypkgapismetav1WatchEventLens of TODO())
    }
}
