package br.com.astrosoft.framework.model

import io.ebean.typequery.generator.Generator
import io.ebean.typequery.generator.GeneratorConfig

fun main() {
  val config = GeneratorConfig()
  config.lang = "kt"
  config.classesDirectory = "./build/classes/kotlin/main/"
  config.destDirectory = "./src/main/kotlin"
  config.destResourceDirectory = "./src/main/resources"

  config.entityBeanPackage = "br.com.astrosoft.agenda.model.ebean"
  config.destPackage = "${config.entityBeanPackage}.query"

  config.isAddFinderTextMethod = false
  config.isAddFinderWherePublic = false
  config.isAddFinderWhereMethod = false

  config.isOverwriteExistingFinders = true
  val generator = Generator(config)
  generator.generateQueryBeans() // Additionally generate 'finder's
  generator.generateFinders()
  generator.modifyEntityBeansAddFinderField()
}

