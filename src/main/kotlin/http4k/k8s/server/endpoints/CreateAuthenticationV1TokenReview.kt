package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.authentication.v1.TokenReview
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
 * create a TokenReview
 * Request:
 * 	* / *
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateAuthenticationV1TokenReview(): RoutingHttpHandler {
    val iok8sapiauthenticationv1TokenReviewLens = Body.auto<TokenReview>().toLens()
    val dryRunLens = Query.string().optional("dryRun")
    val fieldManagerLens = Query.string().optional("fieldManager")
    val fieldValidationLens = Query.string().optional("fieldValidation")
    val prettyLens = Query.string().optional("pretty")

    return "/apis/authentication.k8s.io/v1/tokenreviews" bind Method.POST to { req: Request ->
        val dryRun = dryRunLens(req)
        val fieldManager = fieldManagerLens(req)
        val fieldValidation = fieldValidationLens(req)
        val pretty = prettyLens(req)
        val iok8sapiauthenticationv1TokenReview = iok8sapiauthenticationv1TokenReviewLens(req)
        Response(Status.OK)
            .with(iok8sapiauthenticationv1TokenReviewLens of TODO())
    }
}
