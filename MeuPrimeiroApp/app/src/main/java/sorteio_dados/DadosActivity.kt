package sorteio_dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.databinding.ActivityDadosBinding
import greeter.Dado

class DadosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDadosBinding
    //criação dos dados
    private val dado1 = Dado(4)
    private val dado2 = Dado(6)
    private val dado3 = Dado(8)
    private val dado4 = Dado(10)

    //criação dos indices para variar a quantidade de lados
    private var indice1 = 0
    private var indice2 = 0
    private var indice3 = 0

    //criação da lista de dados
    private var listaDados = mutableListOf<Dado>()








































//    private val dado1 = Dado(4)
//    private val dado2 = Dado(6)
//    private val dado3 = Dado(8)
//    private val dado4 = Dado(10)
//    private var listaDados = mutableListOf<Dado>()
//    var posicaoAtual1 = 0
//    var posicaoAtual2 = 0
//    var posicaoAtual3 = 0
//
























    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosBinding.inflate(layoutInflater)
        listaDados.add(dado1)
        listaDados.add(dado2)
        listaDados.add(dado3)
        listaDados.add(dado4)


        setTitle("Sorteio de Dados")

        binding.btSortear.setOnClickListener(){
            binding.txtQuantiLados1.text = "${listaDados[indice1].numeroLados}"
            binding.txtNumeroDados1.text = listaDados[indice1].lancar()

            binding.txtQuantiLados2.text = "${listaDados[indice2].numeroLados}"
            binding.txtNumeroDados2.text = listaDados[indice2].lancar()

            binding.txtQuantiLados3.text = "${listaDados[indice3].numeroLados}"
            binding.txtNumeroDados3.text = listaDados[indice3].lancar()

            Toast.makeText(this, "Sorteio Realizado!!", Toast.LENGTH_SHORT).show()
        }

        //variavel listaDeDados = [0, 1, 2, 3]
        //[dado1, dado2, dado3, dado4]

        binding.btTrocar1.setOnClickListener(){
            indice1++
            if(indice1 == listaDados.size) indice1 = 0
            binding.txtQuantiLados1.text = "${listaDados[indice1].numeroLados}"
        }

        binding.btTrocar2.setOnClickListener(){
            indice2++
            if (indice2 == listaDados.size) indice2 = 0
            binding.txtQuantiLados2.text = "${listaDados[indice2].numeroLados}"
        }

        binding.btTrocar3.setOnClickListener(){
            indice3++
            if (indice3 == listaDados.size) indice3 = 0
            binding.txtQuantiLados3.text = "${listaDados[indice3].numeroLados}"
        }




































//        listaDados.add(dado1)
//        listaDados.add(dado2)
//        listaDados.add(dado3)
//        listaDados.add(dado4)
//
//        binding.btSortear.setOnClickListener(){
//            binding.txtNumeroDados1.text = listaDados[posicaoAtual1].lancar()
//            binding.txtQuantiLados1.text = "${listaDados[posicaoAtual1].numeroLados} lados"
//            binding.txtNumeroDados2.text = listaDados[posicaoAtual2].lancar()
//            binding.txtQuantiLados2.text = "${listaDados[posicaoAtual2].numeroLados} lados"
//            binding.txtNumeroDados3.text = listaDados[posicaoAtual3].lancar()
//            binding.txtQuantiLados3.text= "${listaDados[posicaoAtual3].numeroLados} lados"
//        }
//        binding.btTrocar1.setOnClickListener(){
//            posicaoAtual1++
//
//            if(posicaoAtual1 == listaDados.size ){
//                posicaoAtual1 = 0
//            }
//            binding.txtQuantiLados1.text = "${listaDados[posicaoAtual1].numeroLados} lados"
//        }
//
//        binding.btTrocar2.setOnClickListener(){
//            posicaoAtual2++
//
//            if(posicaoAtual2 == listaDados.size ){
//                posicaoAtual2 = 0
//            }
//            binding.txtQuantiLados2.text = "${listaDados[posicaoAtual2].numeroLados} lados"
//        }
//
//        binding.btTrocar3.setOnClickListener(){
//            posicaoAtual3++
//
//            if(posicaoAtual3 == listaDados.size ){
//                posicaoAtual3 = 0
//            }
//            binding.txtQuantiLados3.text = "${listaDados[posicaoAtual3].numeroLados} lados"
//        }

        setContentView(binding.root)
    }
}