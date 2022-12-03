package http4k.k8s.server.endpoints

import kotlin.String
import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.lens.Path
import org.http4k.lens.Query
import org.http4k.lens.boolean
import org.http4k.lens.int
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * read log of the specified Pod
 * Response:
 * 	text/plain
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadCoreV1NamespacedPodLog(): RoutingHttpHandler {
	val readCoreV1NamespacedPodLogPlainResponse200Lens = Body.auto<String>().toLens()
	val containerLens = Query.string().optional("container")
	val followLens = Query.boolean().optional("follow")
	val insecureSkipTLSVerifyBackendLens = Query.boolean().optional("insecureSkipTLSVerifyBackend")
	val limitBytesLens = Query.int().optional("limitBytes")
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")
	val previousLens = Query.boolean().optional("previous")
	val sinceSecondsLens = Query.int().optional("sinceSeconds")
	val tailLinesLens = Query.int().optional("tailLines")
	val timestampsLens = Query.boolean().optional("timestamps")

	return "/api/v1/namespaces/{namespace}/pods/{name}/log" bind Method.GET to { req: Request ->
		val container = containerLens(req)
		val follow = followLens(req)
		val insecureSkipTLSVerifyBackend = insecureSkipTLSVerifyBackendLens(req)
		val limitBytes = limitBytesLens(req)
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		val previous = previousLens(req)
		val sinceSeconds = sinceSecondsLens(req)
		val tailLines = tailLinesLens(req)
		val timestamps = timestampsLens(req)
		Response(Status.OK)
			.with(readCoreV1NamespacedPodLogPlainResponse200Lens of TODO())
	}
}
