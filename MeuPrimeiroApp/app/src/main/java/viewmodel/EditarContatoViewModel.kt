package viewmodel

import model.Contato
import repository.room.AppDatabase
import repository.room.ContatoRepository

class EditarContatoViewModel(database: AppDatabase) {
    private val contatoRepository = ContatoRepository(database)

    fun getContatoById(id : Long): Contato {
        return contatoRepository.contatoById(id)
    }

    fun saveContato(contato: Contato) {
        contatoRepository.save(contato)
    }

    fun deletecontato(contato: Contato){
        contatoRepository.delete(contato)
    }
}