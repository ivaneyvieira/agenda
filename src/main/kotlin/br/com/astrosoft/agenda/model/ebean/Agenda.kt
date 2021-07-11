package br.com.astrosoft.agenda.model.ebean

import br.com.astrosoft.agenda.model.ebean.finder.AgendaFinder
import br.com.astrosoft.framework.model.BaseModel
import io.ebean.annotation.Length
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Lob
import javax.persistence.Table

@Entity
@Table(name = "agenda")
class Agenda(var data: LocalDate,
             @Length(500)
             var descricao: String,
             @Lob
             var array: ByteArray) : BaseModel() {

  companion object Find : AgendaFinder() {

  }
}
