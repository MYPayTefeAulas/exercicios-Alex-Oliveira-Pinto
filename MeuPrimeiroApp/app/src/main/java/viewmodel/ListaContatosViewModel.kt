package viewmodel

import androidx.room.Database
import model.Contato
import repository.room.AppDatabase
import repository.room.ContatoRepository

class ListaContatosViewModel(database: AppDatabase) {
    private val contatoRepository = ContatoRepository(database)

    fun getAllContatos(): List<Contato>{
        return contatoRepository.getAllContatos()
    }
}