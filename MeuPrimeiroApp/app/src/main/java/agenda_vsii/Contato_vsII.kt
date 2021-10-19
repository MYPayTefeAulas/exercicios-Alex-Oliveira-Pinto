package agenda_vsii

import android.text.Editable

data class Contato_vsII(var nome: String, var telefone: String) {

    fun checarNomeVazio(): Boolean{
        return nome == ""
    }
    fun checarTelefoneVazio(): Boolean{
        return nome == ""
    }

    val id = getProximoId()

    companion object {
        var lastId = -1

        fun getProximoId(): Int {
            return lastId++
        }
    }
}