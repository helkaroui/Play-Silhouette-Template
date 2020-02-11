package application.modules

import com.google.inject.AbstractModule
import infrastructure.daos.{ AuthTokenDAO, AuthTokenDAOImpl }
import application.services.{ AuthTokenService, AuthTokenServiceImpl }
import net.codingwell.scalaguice.ScalaModule

/**
 * The base Guice module.
 */
class BaseModule extends AbstractModule with ScalaModule {

  /**
   * Configures the module.
   */
  def configure(): Unit = {
    bind[AuthTokenDAO].to[AuthTokenDAOImpl]
    bind[AuthTokenService].to[AuthTokenServiceImpl]
  }
}
