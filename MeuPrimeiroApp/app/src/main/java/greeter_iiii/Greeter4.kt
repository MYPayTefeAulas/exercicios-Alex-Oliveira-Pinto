package greeter_iiii

import greeter.Pessoa

class Greeter4(val cumprimento : String, val sufixo: String) {
    companion object {
        var totalGreeter4 = 0
            private set
    }

    init {
        totalGreeter4++
    }

    fun greet4(pessoa: Pessoa): String{
        return "$cumprimento ${pessoa.nome} voce tem ${pessoa.idade} anos $sufixo"
    }
}

//binding.btTrocar.setOnClickListener() {
//    if(greeterAtual == 1){
//        greeterAtual = 2
//        binding.txtNumeroGreeter.text = "2"
//    } else {
//        greeterAtual = 1
//        binding.txtNumeroGreeter.text = "1"
//    }
//}