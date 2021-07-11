package br.com.astrosoft.agenda.model.ebean.finder

import br.com.astrosoft.agenda.model.ebean.Agenda
import io.ebean.Finder

open class AgendaFinder : Finder<Long, Agenda>(Agenda::class.java)


