package br.com.astrosoft.agenda.model.ebean.query.assoc

import br.com.astrosoft.agenda.model.ebean.Agenda
import br.com.astrosoft.agenda.model.ebean.query.QAgenda
import io.ebean.typequery.PInteger
import io.ebean.typequery.PLocalDate
import io.ebean.typequery.PLocalDateTime
import io.ebean.typequery.PLong
import io.ebean.typequery.PString
import io.ebean.typequery.TQAssocBean
import io.ebean.typequery.TQProperty
import io.ebean.typequery.TypeQueryBean

/**
 * Association query bean for AssocAgenda.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
class QAssocAgenda<R>(name: String, root: R) : TQAssocBean<Agenda,R>(name, root) {

  lateinit var id: PLong<R>
  lateinit var createdAt: PLocalDateTime<R>
  lateinit var updatedAt: PLocalDateTime<R>
  lateinit var version: PInteger<R>
  lateinit var data: PLocalDate<R>
  lateinit var descricao: PString<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QAgenda>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QAgenda>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QAgenda>) : R {
    return fetchLazyProperties(*properties)
  }

}
