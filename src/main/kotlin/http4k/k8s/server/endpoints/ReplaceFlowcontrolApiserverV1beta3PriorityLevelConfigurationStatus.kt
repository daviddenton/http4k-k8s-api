package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.flowcontrol.v1beta3.PriorityLevelConfiguration
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
 * replace status of the specified PriorityLevelConfiguration
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun ReplaceFlowcontrolApiserverV1beta3PriorityLevelConfigurationStatus():
		RoutingHttpHandler {
	val iok8sapiflowcontrolv1beta3PriorityLevelConfigurationLens =
			Body.auto<PriorityLevelConfiguration>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/flowcontrol.apiserver.k8s.io/v1beta3/prioritylevelconfigurations/{name}/status" bind Method.PUT to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapiflowcontrolv1beta3PriorityLevelConfiguration = iok8sapiflowcontrolv1beta3PriorityLevelConfigurationLens(req)
		Response(Status.OK)
			.with(iok8sapiflowcontrolv1beta3PriorityLevelConfigurationLens of TODO())
	}
}
