package repository

import model.Contato

interface ContatoDataSource {

        fun save(obj: Contato)
        fun insert(obj: Contato): Long
        fun update(obj: Contato)
        fun delete(obj: Contato)
        fun contatoById(id: Long): Contato
        fun getAllContatos(): List<Contato>

}