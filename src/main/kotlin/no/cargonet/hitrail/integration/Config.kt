package no.cargonet.hitrail.integration

import java.time.Instant
import java.util.Properties
import kotlinx.serialization.Serializable
import no.cargonet.hitrail.integration.serialization.SerializableInstant
import no.liflig.properties.intRequired
import no.liflig.properties.loadProperties
import no.liflig.properties.stringNotNull

/**
 * Holds configuration of the lambda.
 *
 * @see [Config.load]
 */
data class Config(
    private val properties: Properties,
    val buildInfo: BuildInfo = BuildInfo.from(properties),
) {
  companion object {
    /**
     * Creates a new instance based on `application.properties` and AWS Parameter Store (if
     * available).
     */
    fun load() = Config(loadProperties())
  }
}

@Serializable // Serializable for logging
data class BuildInfo(
    val timestamp: SerializableInstant,
    /** Git commit sha. */
    val commit: String,
    /** Git branch. */
    val branch: String,
    /** CI build number. */
    val number: Int,
) {
  companion object {
    /** Create [BuildInfo] based on keys in `application.properties`. */
    fun from(properties: Properties) =
        BuildInfo(
            timestamp = Instant.parse(properties.stringNotNull("build.timestamp")),
            commit = properties.stringNotNull("build.commit"),
            branch = properties.stringNotNull("build.branch"),
            number =
                try {
                  properties.intRequired("build.number")
                } catch (_: IllegalArgumentException) {
                  0
                },
        )
  }
}
