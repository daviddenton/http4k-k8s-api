package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.networking.v1alpha1.ClusterCIDR
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
 * create a ClusterCIDR
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateNetworkingV1alpha1ClusterCIDR(): RoutingHttpHandler {
    val iok8sapinetworkingv1alpha1ClusterCIDRLens = Body.auto<ClusterCIDR>().toLens()
    val prettyLens = Query.string().optional("pretty")
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")

    return "/apis/networking.k8s.io/v1alpha1/clustercidrs" bind Method.POST to { req: Request ->
        val pretty = prettyLens(req)
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val iok8sapinetworkingv1alpha1ClusterCIDR = iok8sapinetworkingv1alpha1ClusterCIDRLens(req)
        Response(Status.OK)
            .with(iok8sapinetworkingv1alpha1ClusterCIDRLens of TODO())
    }
}
