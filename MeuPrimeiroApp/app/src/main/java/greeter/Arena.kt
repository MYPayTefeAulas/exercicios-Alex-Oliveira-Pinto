package greeter

class Arena(val guerreiro1: Guerreiro, val guerreiro2: Guerreiro) {
    private var dadoAtaque = Dado(4)
    private var nAtaque = 1

    fun decrementar( guerreiro: Guerreiro): Int {
        val decremento = dadoAtaque.lancar().toInt()
        println(decremento)
        if(guerreiro.vidaAtual - decremento <= 0)
            guerreiro.vidaAtual = 0

        else
            guerreiro.vidaAtual -= decremento
        return guerreiro.vidaAtual
    }

    fun obterBarraVida1(guerreiro: Guerreiro): MutableList<String> {
        var listaVida1 = mutableListOf<String>()
        var i = 0
        while(i < guerreiro.vidaAtual){
            listaVida1.add("#")
            i++
        }

        return listaVida1
    }

    fun incrementarNataque(): Int {
        return nAtaque++
    }

    fun decrementarNAtaque(): Int{
        return nAtaque--
    }
}

