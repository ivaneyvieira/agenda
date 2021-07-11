package br.com.astrosoft.framework.model

import br.com.astrosoft.framework.model.EBeanConfig.database
import io.ebean.*

object Transaction {
  private fun inTransaction(): Boolean {
    return database.currentTransaction() != null
  }

  fun <T> execTransacao(lambda: () -> T): T {
    return if (inTransaction()) lambda()
    else database.beginTransaction().use { transaction ->
      val ret = lambda()
      transaction.commit()
      ret
    }
  }

  fun variable(name: String, value: String?) {
    database.currentTransaction()?.connection?.let { con ->
              val stmt = con.createStatement()
              val sql = "SET @$name := $value;"
              stmt.executeQuery(sql)
            }
  }

  fun createSqlUpdate(sql: String): SqlUpdate? {
    return database.sqlUpdate(sql)
  }

  fun <T> find(javaClass: Class<T>): Query<T>? {
    return database.find(javaClass)
  }

  fun createSqlQuery(sql: String): SqlQuery? {
    return database.sqlQuery(sql)
  }
}
