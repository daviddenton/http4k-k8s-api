package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.admissionregistration.v1alpha1.ValidatingAdmissionPolicyBinding
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
 * read the specified ValidatingAdmissionPolicyBinding
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadAdmissionregistrationV1alpha1ValidatingAdmissionPolicyBinding(): RoutingHttpHandler {
	val iok8sapiadmissionregistrationv1alpha1ValidatingAdmissionPolicyBindingLens =
			Body.auto<ValidatingAdmissionPolicyBinding>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")

	return "/apis/admissionregistration.k8s.io/v1alpha1/validatingadmissionpolicybindings/{name}" bind Method.GET to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		Response(Status.OK)
			.with(iok8sapiadmissionregistrationv1alpha1ValidatingAdmissionPolicyBindingLens of TODO())
	}
}
