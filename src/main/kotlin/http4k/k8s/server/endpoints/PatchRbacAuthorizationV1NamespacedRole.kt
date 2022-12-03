package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.rbac.v1.Role
import http4k.k8s.model.io.k8s.apimachinery.pkg.apis.meta.v1.Patch
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
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * partially update the specified Role
 * Request:
 * 	application/json-patch+json 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun PatchRbacAuthorizationV1NamespacedRole(): RoutingHttpHandler {
	val iok8sapimachinerypkgapismetav1PatchLens = Body.auto<Patch>().toLens()
	val iok8sapirbacv1RoleLens = Body.auto<Role>().toLens()
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")
	val forceLens = Query.boolean().optional("force")

	return "/apis/rbac.authorization.k8s.io/v1/namespaces/{namespace}/roles/{name}" bind Method.PATCH to { req: Request ->
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val force = forceLens(req)
		val iok8sapimachinerypkgapismetav1Patch = iok8sapimachinerypkgapismetav1PatchLens(req)
		Response(Status.OK)
			.with(iok8sapirbacv1RoleLens of TODO())
	}
}
