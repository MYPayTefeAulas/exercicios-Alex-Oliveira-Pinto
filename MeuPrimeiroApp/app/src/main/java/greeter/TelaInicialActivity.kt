package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityTelaInicialBinding
import greeter_iiii.Greeter4Activity
import sorteio_dados.DadosActivity
import android.content.Intent as Intent1

class TelaInicialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)

        binding.btGreeter4.setOnClickListener(){
            val intent= Intent1(this, Greeter4Activity::class.java)
            startActivity(intent)
        }

        binding.btListaPessoas.setOnClickListener(){
            val intent = Intent1(this,PessoasActivity::class.java)
            startActivity(intent)
        }

        binding.btCalculadora.setOnClickListener(){
            val intent = Intent1(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btSorteioDados.setOnClickListener(){
            val intent = Intent1(this, DadosActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}

//R.layout.activity_tela_inicial