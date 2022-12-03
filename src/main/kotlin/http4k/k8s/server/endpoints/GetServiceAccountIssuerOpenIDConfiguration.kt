package http4k.k8s.server.endpoints

import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.core.with
import org.http4k.format.Jackson.auto
import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.bind

/**
 * get service account issuer OpenID configuration, also known as the 'OIDC discovery doc'
 * Response:
 * 	application/json
 * 		200 OK
 * 		401 Unauthorized
 */
fun GetServiceAccountIssuerOpenIDConfiguration(): RoutingHttpHandler {
    val getServiceAccountIssuerOpenIDConfigurationJsonResponse200Lens = Body.auto<String>().toLens()

    return "/.well-known/openid-configuration/" bind Method.GET to { req: Request ->
        Response(Status.OK)
            .with(getServiceAccountIssuerOpenIDConfigurationJsonResponse200Lens of TODO())
    }
}
