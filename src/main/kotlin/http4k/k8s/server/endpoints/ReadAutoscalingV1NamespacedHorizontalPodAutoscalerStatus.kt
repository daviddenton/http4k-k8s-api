package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.autoscaling.v1.HorizontalPodAutoscaler
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
 * read status of the specified HorizontalPodAutoscaler
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadAutoscalingV1NamespacedHorizontalPodAutoscalerStatus(): RoutingHttpHandler {
	val iok8sapiautoscalingv1HorizontalPodAutoscalerLens =
			Body.auto<HorizontalPodAutoscaler>().toLens()
	val nameLens = Path.string().of("name")
	val namespaceLens = Path.string().of("namespace")
	val prettyLens = Query.string().optional("pretty")

	return "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" bind Method.GET to { req: Request ->
		val name = nameLens(req)
		val namespace = namespaceLens(req)
		val pretty = prettyLens(req)
		Response(Status.OK)
			.with(iok8sapiautoscalingv1HorizontalPodAutoscalerLens of TODO())
	}
}
