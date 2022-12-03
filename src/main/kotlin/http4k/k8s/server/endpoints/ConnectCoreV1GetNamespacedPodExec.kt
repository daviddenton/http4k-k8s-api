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
import org.http4k.lens.string
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * connect GET requests to exec of Pod
 * Response:
 * 	* / *
 * 		200 OK
 * 		401 Unauthorized
 */
fun ConnectCoreV1GetNamespacedPodExec(): RoutingHttpHandler {
	val connectCoreV1GetNamespacedPodExecResponse200Lens = Body.auto<String>().toLens()
	val commandLens = Query.string().optional("command")
	val containerLens = Query.string().optional("container")
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val stderrLens = Query.boolean().optional("stderr")
	val stdinLens = Query.boolean().optional("stdin")
	val stdoutLens = Query.boolean().optional("stdout")
	val ttyLens = Query.boolean().optional("tty")

	return "/api/v1/namespaces/{namespace}/pods/{name}/exec" bind Method.GET to { req: Request ->
		val command = commandLens(req)
		val container = containerLens(req)
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val stderr = stderrLens(req)
		val stdin = stdinLens(req)
		val stdout = stdoutLens(req)
		val tty = ttyLens(req)
		Response(Status.OK)
			.with(connectCoreV1GetNamespacedPodExecResponse200Lens of TODO())
	}
}
