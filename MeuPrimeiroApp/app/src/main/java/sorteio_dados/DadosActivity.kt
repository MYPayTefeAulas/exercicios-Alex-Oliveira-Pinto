package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityDadosBinding
import greeter.Dado

class DadosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDadosBinding
    private val dado1 = Dado(4)
    private val dado2 = Dado(6)
    private val dado3 = Dado(8)
    private val dado4 = Dado(10)
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


        binding.btSortear.setOnClickListener(){
            binding.txtQuantiLados1.text = "${dado1.numeroLados}"
            binding.txtNumeroDados1.text = listaDados[1].lancar()
            binding.txtQuantiLados2.text = "${dado2.numeroLados}"
            binding.txtNumeroDados2.text = listaDados[2].lancar()
            binding.txtQuantiLados3.text = "${dado4.numeroLados}"
            binding.txtNumeroDados3.text = dado4.lancar()
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