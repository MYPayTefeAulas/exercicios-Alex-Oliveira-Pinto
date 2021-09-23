package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityListasBinding
import com.example.meuprimeiroapp.databinding.ActivityMainBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListasBinding
    private val listaFrutas = listOf("laranja","açai","manga", "melão","abacate")
    private val listaVegetais = listOf("pepino","alface","pimentão")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)
        binding.btAnalisa.setOnClickListener(){
            binding.txtSaidaAnalisa.text = testaEntrada(binding.txtEntradaAnalisa.text.toString())
        }



        setContentView(binding.root)
    }
    var encontrouAlimentos = false

    fun testaEntrada(entrada: String): String{
        var saida = ""

        for (fruta in listaFrutas){
            if (fruta == entrada){
                saida = "É uma fruta"
                encontrouAlimentos = true
                break
            }
        }

        for (vegetal in listaVegetais){
            if (vegetal == entrada){
                saida = "É um vegetal"
                encontrouAlimentos = true
                break
            }
        }

        if (!encontrouAlimentos){
            saida = "Não sei o que é isso"
        }

        return saida
    }
}

