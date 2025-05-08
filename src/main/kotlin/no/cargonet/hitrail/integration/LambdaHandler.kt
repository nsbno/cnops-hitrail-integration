@file:Suppress("CanBeParameter")

package no.cargonet.hitrail.integration

import com.amazonaws.services.lambda.runtime.events.SQSEvent
import no.liflig.logging.getLogger

private val log = getLogger {}

/**
 * [LambdaHandler.handle] is the entrypoint for AWS Lambda.
 *
 * AWS calls the default constructor here when the lambda is triggered for the first time. It calls
 * the constructor with no parameters, so make sure that all parameters here have default values
 * (you may still want parameters here, to override them in tests). A lambda instance may be
 * re-used, so dependencies should be set up on this class so that consecutive lambda invocations
 * don't have to re-initialize dependencies.
 *
 * When setting up this lambda in AWS CDK, set the `handler` property to
 * `no.cargonet.hitrail.integration.LambdaHandler::handle`.
 */
class LambdaHandler(
    private val config: Config = Config.load(),
) {
  init {
    log.info {
      field("buildInfo", config.buildInfo)
      "Starting lambda handler"
    }
  }

  fun handle(sqsEvent: SQSEvent) {
    for (message in sqsEvent.records) {
      log.info {
        rawJsonField("event", message.body)
        "Processing SQS message"
      }
    }
  }
}
