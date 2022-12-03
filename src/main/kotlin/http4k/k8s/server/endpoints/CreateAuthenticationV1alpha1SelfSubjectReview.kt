package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.authentication.v1alpha1.SelfSubjectReview
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
 * create a SelfSubjectReview
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateAuthenticationV1alpha1SelfSubjectReview(): RoutingHttpHandler {
    val iok8sapiauthenticationv1alpha1SelfSubjectReviewLens = Body.auto<SelfSubjectReview>().toLens()
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")
    val prettyLens = Query.string().optional("pretty")

    return "/apis/authentication.k8s.io/v1alpha1/selfsubjectreviews" bind Method.POST to { req: Request ->
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val pretty = prettyLens(req)
        val iok8sapiauthenticationv1alpha1SelfSubjectReview = iok8sapiauthenticationv1alpha1SelfSubjectReviewLens(req)
        Response(Status.OK)
            .with(iok8sapiauthenticationv1alpha1SelfSubjectReviewLens of TODO())
    }
}
