package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.autoscaling.v2.HorizontalPodAutoscaler
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
 * read the specified HorizontalPodAutoscaler
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadAutoscalingV2NamespacedHorizontalPodAutoscaler(): RoutingHttpHandler {
    val iok8sapiautoscalingv2HorizontalPodAutoscalerLens =
        Body.auto<HorizontalPodAutoscaler>().toLens()
    val nameLens = Path.string().of("name")
    val namespaceLens = Path.string().of("namespace")
    val prettyLens = Query.string().optional("pretty")

    return "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}" bind Method.GET to { req: Request ->
        val name = nameLens(req)
        val namespace = namespaceLens(req)
        val pretty = prettyLens(req)
        Response(Status.OK)
            .with(iok8sapiautoscalingv2HorizontalPodAutoscalerLens of TODO())
    }
}
