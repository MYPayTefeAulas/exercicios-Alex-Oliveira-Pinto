package greeter

class Pessoa (val nome: String, val idade: Int?, val telefone: String?){
    companion object {
        var totalPessoas = 0
            private set
    }
    init {
        totalPessoas++
    }

    fun verificaNomeVazio(): Boolean {
        return nome == ""
    }
    fun verificaTelefoneVazio(): Boolean {
         return telefone == ""
     }
}