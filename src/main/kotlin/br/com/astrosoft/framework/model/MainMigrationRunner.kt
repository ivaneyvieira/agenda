package br.com.astrosoft.framework.model

import io.ebean.annotation.Platform
import io.ebean.dbmigration.DbMigration

fun main() { // System.setProperty("ddl.migration.generate", "true")
  val dbMigration: DbMigration = DbMigration.create()
  dbMigration.setPlatform(Platform.MYSQL)

  dbMigration.generateMigration()
}

