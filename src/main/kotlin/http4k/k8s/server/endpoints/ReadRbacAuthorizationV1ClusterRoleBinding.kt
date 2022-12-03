package http4k.k8s.server.endpoints

import http4k.k8s.model.io.k8s.api.rbac.v1.ClusterRoleBinding
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
 * read the specified ClusterRoleBinding
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun ReadRbacAuthorizationV1ClusterRoleBinding(): RoutingHttpHandler {
    val iok8sapirbacv1ClusterRoleBindingLens = Body.auto<ClusterRoleBinding>().toLens()
    val nameLens = Path.string().of("name")
    val prettyLens = Query.string().optional("pretty")

    return "/apis/rbac.authorization.k8s.io/v1/clusterrolebindings/{name}" bind Method.GET to { req: Request ->
        val name = nameLens(req)
        val pretty = prettyLens(req)
        Response(Status.OK)
            .with(iok8sapirbacv1ClusterRoleBindingLens of TODO())
    }
}
