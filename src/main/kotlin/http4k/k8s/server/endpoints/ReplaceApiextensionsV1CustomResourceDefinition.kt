package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.apiextensions.apiserver.pkg.apis.apiextensions.v1.CustomResourceDefinition
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
 * replace the specified CustomResourceDefinition
 * Request:
 * 	* / * 
 * Response:
 * 	application/json
 * 		200 OK
 * 		201 Created
 * 		401 Unauthorized
 */
fun ReplaceApiextensionsV1CustomResourceDefinition(): RoutingHttpHandler {
	val iok8sapiextensionsapiserverpkgapisapiextensionsv1CustomResourceDefinitionLens =
			Body.auto<CustomResourceDefinition>().toLens()
	val nameLens = Path.string().of("name")
	val prettyLens = Query.string().optional("pretty")
	val dryRunLens = Query.string().optional("dryRun")
	val fieldManagerLens = Query.string().optional("fieldManager")
	val fieldValidationLens = Query.string().optional("fieldValidation")

	return "/apis/apiextensions.k8s.io/v1/customresourcedefinitions/{name}" bind Method.PUT to { req: Request ->
		val name = nameLens(req)
		val pretty = prettyLens(req)
		val dryRun = dryRunLens(req)
		val fieldManager = fieldManagerLens(req)
		val fieldValidation = fieldValidationLens(req)
		val iok8sapiextensionsapiserverpkgapisapiextensionsv1CustomResourceDefinition = iok8sapiextensionsapiserverpkgapisapiextensionsv1CustomResourceDefinitionLens(req)
		Response(Status.OK)
			.with(iok8sapiextensionsapiserverpkgapisapiextensionsv1CustomResourceDefinitionLens of TODO())
	}
}
