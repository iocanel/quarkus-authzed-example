
package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import io.quarkiverse.authzed.client.AuthzedClient;

public class ProducesClient {

    @Produces
    @ApplicationScoped
    UsesClient create(AuthzedClient client) {
      return new UsesClient(client);
    }
}
