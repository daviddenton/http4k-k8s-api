package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.autoscaling.v1.Scale
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
 * replace scale of the specified ReplicaSet
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun ReplaceAppsV1NamespacedReplicaSetScale(): RoutingHttpHandler {
	val iok8sapiautoscalingv1ScaleLens = Body.auto<Scale>().toLens()
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/apps/v1/namespaces/{namespace}/replicasets/{name}/scale" bind Method.PUT to { req: Request ->
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapiautoscalingv1Scale = iok8sapiautoscalingv1ScaleLens(req)
		Response(Status.OK)
			.with(iok8sapiautoscalingv1ScaleLens of TODO())
	}
}
