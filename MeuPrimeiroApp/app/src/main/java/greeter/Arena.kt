package greeter

class Arena(val guerreiro1: Guerreiro, val guerreiro2: Guerreiro) {
    private var dadoAtaque = Dado(6)
    private var listaVida1 = mutableListOf<String>()
    private var i = 0
    
    fun decrementar( guerreiro: Guerreiro ): Int {
        val decremento = dadoAtaque.lancar().toInt()
        guerreiro.vidaMaxima -= decremento
        return guerreiro.vidaMaxima
    }

    fun obterBarraVida1(guerreiro: Guerreiro): MutableList<String> {
        while(i < guerreiro.vidaMaxima){
            listaVida1.add("#")
            i++
        }

        return listaVida1
    }
}

