package greeter

class Guerreiro(val nome: String, val forcaAtaque: Int, var vidaMaxima: Int) {
    var vidaAtual: Int = vidaMaxima
    private var listaVida = mutableListOf<String>()
    private var i = 0

    fun obterBarraVida(): MutableList<String> {
        while(i < vidaAtual){
            listaVida.add("#")
            i++
        }

        return listaVida
    }

}