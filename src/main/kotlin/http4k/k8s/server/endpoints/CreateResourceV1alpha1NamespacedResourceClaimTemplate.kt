package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.resource.v1alpha1.ResourceClaimTemplate
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
 * create a ResourceClaimTemplate
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateResourceV1alpha1NamespacedResourceClaimTemplate(): RoutingHttpHandler {
    val iok8sapiresourcev1alpha1ResourceClaimTemplateLens = Body.auto<ResourceClaimTemplate>().toLens()
    val namespaceLens = Path.string().of("namespace")
    val prettyLens = Query.string().optional("pretty")
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")

    return "/apis/resource.k8s.io/v1alpha1/namespaces/{namespace}/resourceclaimtemplates" bind Method.POST to { req: Request ->
        val namespace = namespaceLens(req)
        val pretty = prettyLens(req)
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val iok8sapiresourcev1alpha1ResourceClaimTemplate = iok8sapiresourcev1alpha1ResourceClaimTemplateLens(req)
        Response(Status.OK)
            .with(iok8sapiresourcev1alpha1ResourceClaimTemplateLens of TODO())
    }
}
