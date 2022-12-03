package http4k.k8s.server.endpoints

import kotlin.String
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
 * get service account issuer OpenID JSON Web Key Set (contains public token verification keys)
 * Response:
 * 	application/jwk-set+json
 * 		200 OK
 * 		401 Unauthorized
 */
fun GetServiceAccountIssuerOpenIDKeyset(): RoutingHttpHandler {
	val getServiceAccountIssuerOpenIDKeysetJwksetjsonResponse200Lens = Body.auto<String>().toLens()

	return "/openid/v1/jwks/" bind Method.GET to { req: Request ->
		Response(Status.OK)
			.with(getServiceAccountIssuerOpenIDKeysetJwksetjsonResponse200Lens of TODO())
	}
}
