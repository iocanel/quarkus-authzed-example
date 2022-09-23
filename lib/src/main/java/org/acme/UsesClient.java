
package org.acme;

import io.quarkiverse.authzed.client.AuthzedClient;

public class UsesClient {

  private final AuthzedClient client;

  public UsesClient(AuthzedClient client) {
    this.client = client;
  }

  public AuthzedClient getClient() {
    return client;
  }

}
