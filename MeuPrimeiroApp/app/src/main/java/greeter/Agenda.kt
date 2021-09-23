package greeter

class Agenda() {
    private val listaContatos = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    fun testarContato(contato: Pessoa): String{

        var encontrou : String = "false"

        for (lista in listaContatos) {
            if ((lista.nome == contato.nome) && (lista.telefone == contato.telefone)) {
                encontrou = "true"
                break

            }
        }
        return encontrou
    }

    fun salvarContato(novoContato: Pessoa) {
        listaContatos.add(novoContato)
    }

    fun imprimirNomeContatos(): String {
        if(indiceAtual == listaContatos.size)
            indiceAtual = 0
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.nome}"
    }

    fun imprimirTelefoneContatos(): String{
        indiceAtual -= 1
        if(indiceAtual == listaContatos.size)
            indiceAtual = 0
        val contatoAtual = listaContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
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

    fun retornaNumeroContatos(): Int {
        return listaContatos.size
    }

    fun pesquisarContato(contato: Pessoa): String {
        var encontrou : String = "false"
        for (lista in listaContatos) {
            if(lista.nome == contato.nome) {
                encontrou = "true"
                break
            }
        }
        return encontrou
    }

    fun imprimirNomeContatosPesquisa(contato: Pessoa): String {
        var encontrou : String = ""

        for (lista in listaContatos) {
            if (lista.nome == contato.nome) {
                encontrou = lista.nome
                break
            }
        }
        return encontrou
    }

    fun imprimirTelefoneContatosPesquisa(contato: Pessoa): String {
        var encontrou : String = ""

        for (lista in listaContatos) {
            if (lista.nome == contato.nome) {
                encontrou = lista.telefone.toString()
                break
            }
        }
        return encontrou
    }


}
