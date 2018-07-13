package io.vertx.workshop.quote;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.workshop.common.MicroServiceVerticle;

/**
 * a verticle generating "fake" quotes based on the configuration.
 */
public class GeneratorConfigVerticle extends MicroServiceVerticle {

  /**
   * The address on which the data are sent.
   */
  public static final String ADDRESS = "market";

  /**
   * This method is called when the verticle is deployed.
   */
  @Override
  public void start() {
    super.start();

    JsonArray quotes = config().getJsonArray("companies");
    for (Object q : quotes) {
      JsonObject company = (JsonObject) q;

      // Deploy the verticle with a configuration.
      //TODO: market data verticle
    }

    // Deploy the verticle with a configuration.
    vertx.deployVerticle(RestQuoteAPIVerticle.class.getName(), new DeploymentOptions().setConfig(config()));


    // Publish the services in the discovery infrastructure
    //TODO: do service discovery

    // Publish a simple http endpoint
    //TODO: http endpoint verticle
  }
}
