package agenda_vsii
import greeter.Pessoa

object Agenda_vsII {
    var listaContatos = mutableListOf<Contato_vsII>()
    var indiceAtual = 0

    fun salvarContato(contato: Contato_vsII){
        listaContatos.add(contato)
    }

    fun checarAgendaVazia(): Boolean{
        return listaContatos.isEmpty()
    }

    fun deletarContato(){
        if(indiceAtual >= 1) {
            indiceAtual -= 1
            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)
        } else {
            val contatoAtual = listaContatos[indiceAtual]
            listaContatos.remove(contatoAtual)
        }
    }
    fun imprimirNome(): String{
        if(indiceAtual == listaContatos.size)
            indiceAtual = 0
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.nome}"
    }

    fun imprimirTelefone(): String{
        indiceAtual -= 1
        if(indiceAtual == listaContatos.size)
            indiceAtual = 0
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
    }

    fun verificaRepetido(contato: Contato_vsII): Boolean{
        var resultado: Boolean = false
        for( lista in listaContatos){
            if(lista.telefone == contato.telefone){
                resultado = true
            }
        }
        return resultado
    }
}

