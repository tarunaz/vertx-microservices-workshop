package io.vertx.workshop.portfolio.impl;

import io.vertx.serviceproxy.ProxyHelper;
import io.vertx.workshop.common.MicroServiceVerticle;
import io.vertx.workshop.portfolio.PortfolioService;

import static io.vertx.workshop.portfolio.PortfolioService.ADDRESS;
import static io.vertx.workshop.portfolio.PortfolioService.EVENT_ADDRESS;

/**
 * A verticle publishing the portfolio service.
 */
public class PortfolioVerticle extends MicroServiceVerticle {

  @Override
  public void start() {
    super.start();

    // Create the service object
    //TODO: create portfolio service

    // Register the service proxy on the event bus
    //TODO: register portfolio service

    // Publish it in the discovery infrastructure
    //TODO: publish portfolio service

    // TODO: implement portfolio service

    //TODO: publish portfolio-events service

  }
}
