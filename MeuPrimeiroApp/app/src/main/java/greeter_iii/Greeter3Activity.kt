package greeter_iii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityGreeter3Binding
import greeter_iii.Greeter3

class Greeter3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityGreeter3Binding
    private val listaNomes = mutableListOf<String>()
    private var indiceAtual = 0
    private var greeterAtual = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreeter3Binding.inflate(layoutInflater)


        //configuração de variaveis "globais" da tela
        val greeter3 = Greeter3("Olá")
        val greeter4 = Greeter3("Bem vindo")
        listaNomes.add("Rodrigo")
        listaNomes.add("Alex")
        listaNomes.add("Robert")

        //configuração dos botões
        binding.btImprimirProximo.setOnClickListener(){
            val nomeAtual = listaNomes[indiceAtual]
            binding.txtSaida.text = greeter3.greet3(nomeAtual)

            when(greeterAtual){
                1 -> binding.txtSaida.text = greeter3.greet3(nomeAtual)
                2 -> binding.txtSaida.text = greeter4.greet3(nomeAtual)
            }
            if(indiceAtual == listaNomes.size -1){
                indiceAtual = 0
            } else indiceAtual++
        }

        binding.btTrocar.setOnClickListener(){
            if(greeterAtual == 1){
                greeterAtual = 2
                binding.txtNumeroGreeter.text = "2"
            } else {
                greeterAtual = 1
                binding.txtNumeroGreeter.text = "1"
            }
        }

        setContentView(binding.root)
    }
}