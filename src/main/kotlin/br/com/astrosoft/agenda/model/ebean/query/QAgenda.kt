package br.com.astrosoft.agenda.model.ebean.query

import br.com.astrosoft.agenda.model.ebean.Agenda
import io.ebean.Database
import io.ebean.typequery.PInteger
import io.ebean.typequery.PLocalDate
import io.ebean.typequery.PLocalDateTime
import io.ebean.typequery.PLong
import io.ebean.typequery.PString
import io.ebean.typequery.TQRootBean
import io.ebean.typequery.TypeQueryBean

/**
 * Query bean for Agenda.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
class QAgenda : TQRootBean<Agenda, QAgenda> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QAgenda(true)
  }

  lateinit var id: PLong<QAgenda>
  lateinit var createdAt: PLocalDateTime<QAgenda>
  lateinit var updatedAt: PLocalDateTime<QAgenda>
  lateinit var version: PInteger<QAgenda>
  lateinit var data: PLocalDate<QAgenda>
  lateinit var descricao: PString<QAgenda>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(Agenda::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(Agenda::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)
}
