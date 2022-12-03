package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.authorization.v1.SelfSubjectAccessReview
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
 * create a SelfSubjectAccessReview
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		202 Accepted
 * 		401 Unauthorized
 */
fun CreateAuthorizationV1SelfSubjectAccessReview(): RoutingHttpHandler {
	val iok8sapiauthorizationv1SelfSubjectAccessReviewLens =
			Body.auto<SelfSubjectAccessReview>().toLens()
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")
	val prettyLens = Query.string().optional("pretty")

	return "/apis/authorization.k8s.io/v1/selfsubjectaccessreviews" bind Method.POST to { req: Request ->
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val pretty = prettyLens(req)
		val iok8sapiauthorizationv1SelfSubjectAccessReview = iok8sapiauthorizationv1SelfSubjectAccessReviewLens(req)
		Response(Status.OK)
			.with(iok8sapiauthorizationv1SelfSubjectAccessReviewLens of TODO())
	}
}
