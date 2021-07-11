package br.com.astrosoft.framework.model

import io.ebean.Database
import io.ebean.DatabaseFactory
import io.ebean.config.DatabaseConfig
import io.ebean.datasource.DataSourceConfig

object EBeanConfig {
  val database = createDataBase()

  private fun createDataBase(): Database {
    val db = DBConfig("db")
    val dataSourceConfig = DataSourceConfig()
    dataSourceConfig.username = db.username
    dataSourceConfig.password = db.password
    dataSourceConfig.url = db.url
    dataSourceConfig.driver = db.driver
    dataSourceConfig.initSql = listOf("select 1 from dual")

    val config = DatabaseConfig()
    config.loadFromProperties()
    config.dataSourceConfig = dataSourceConfig
    config.isRunMigration = true
    return try {
      DatabaseFactory.create(config)
    } catch (e: Throwable) {
      e.printStackTrace()
      throw Exception("Não foi possível carrega as configurações do banco de dados")
    }
  }
}