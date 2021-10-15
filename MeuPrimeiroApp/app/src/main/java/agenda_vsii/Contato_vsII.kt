package agenda_vsii

import android.text.Editable

class Contato_vsII(var nome: String, var telefone: String) {

    fun checarNomeVazio(): Boolean{
        return nome == ""
    }
    fun checarTelefoneVazio(): Boolean{
        return nome == ""
    }
}