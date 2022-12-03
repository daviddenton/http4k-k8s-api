package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.networking.v1.NetworkPolicy
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
 * replace status of the specified NetworkPolicy
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun ReplaceNetworkingV1NamespacedNetworkPolicyStatus(): RoutingHttpHandler {
	val iok8sapinetworkingv1NetworkPolicyLens = Body.auto<NetworkPolicy>().toLens()
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}/status" bind Method.PUT to { req: Request ->
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapinetworkingv1NetworkPolicy = iok8sapinetworkingv1NetworkPolicyLens(req)
		Response(Status.OK)
			.with(iok8sapinetworkingv1NetworkPolicyLens of TODO())
	}
}
