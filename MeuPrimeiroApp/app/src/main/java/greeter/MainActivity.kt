package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.example.meuprimeiroapp.databinding.ActivityMainBinding

class MainActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var operacao : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btSoma.setOnClickListener(){
            operacao = 1
        }

        binding.btSubtracao.setOnClickListener(){
            operacao = 2
        }

        binding.btProduto.setOnClickListener(){
            operacao = 3
        }

        binding.btDivisao.setOnClickListener(){
            operacao = 4
        }

            binding.btIgual.setOnClickListener {
                when (operacao){
                    1 -> binding.txtHellow.text = soma().toString()
                    2 -> binding.txtHellow.text = subracao().toString()
                    3 -> binding.txtHellow.text = produto().toString()
                    4 -> binding.txtHellow.text = divisao().toString()
                }
            }

        val view = binding.root
        setContentView(view)
    }

    fun trocaTexto(){
        binding.txtHellow.text = "Oi,\neu sou o Alex!"
    }

    fun trocaTexto2() {
        binding.txtHellow.text = binding.txtImput1.text.toString()
    }

    fun recebeNumero1(): Double {
        val textoEntrada = binding.txtImput1.text.toString()
        val numero1 = textoEntrada.toDouble()
        return numero1
    }

    fun recebeNumero2(): Double {
        val textoEntrada = binding.txtImput2.text.toString()
        val numero2 = textoEntrada.toDouble()
        return numero2
    }

    fun soma(): Double{
        return recebeNumero1() + recebeNumero2()
    }

    fun subracao(): Double{
        return (recebeNumero1() - recebeNumero2())
    }

    fun produto(): Double{
        return (recebeNumero1()*recebeNumero2())
    }

    fun divisao(): Double {
        return (recebeNumero1()/recebeNumero2())
    }
}

