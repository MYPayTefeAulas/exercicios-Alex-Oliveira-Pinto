package greeter_iiii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityGreeter4Binding
import greeter.Pessoa

class Greeter4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityGreeter4Binding
    private var listaPessoas = mutableListOf<Pessoa>()                      //Lista de Pessoas
    private var listaGreeters = mutableListOf<Greeter4>()                   //Lista de Greeters
    private var nome = ""                                                   //SalvaNome
    private var idade = 0                                                   //SalvaIdade
    private var indiceAtual = 0
    private var greeterAtual = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreeter4Binding.inflate(layoutInflater)

        val greeter4 = Greeter4("Olá", "!")
        val greeter5 = Greeter4("Bem vindo", "!!")

        //configuração do botam Imprimir Proximo
        binding.btImprimirProximo.setOnClickListener(){
            val pessoa1 = listaPessoas[indiceAtual]

            when(greeterAtual){
                1 -> binding.txtSaida.text = greeter4.greet4(pessoa1)
                2 -> binding.txtSaida.text = greeter5.greet4(pessoa1)
            }
            if(indiceAtual == listaPessoas.size -1){
                indiceAtual = 0
            } else indiceAtual++
        }

        //configuração do botão Salvar
        binding.btSalvar.setOnClickListener(){
//            nome = binding.txtImputNome.text.toString()
//            binding.txtImputNome.text?.clear()
//            idade = binding.txtImputIdade.text.toString().toInt()
//            binding.txtImputIdade.text?.clear()
//            val pessoa = Pessoa(nome, idade, telefone = null)
//            listaPessoas.add(pessoa)
        }

        //configuração do botão Trocar
        binding.btTrocar.setOnClickListener() {
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