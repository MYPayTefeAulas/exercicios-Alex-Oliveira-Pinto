package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityBatalhaRpgactivity2Binding

class BatalhaRPGActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBatalhaRpgactivity2Binding
    private val guerreiro1 = Guerreiro("Alex", 0, 15)
    private val guerreiro2 = Guerreiro("Oliveira", 0, 15)
    private val arena = Arena(guerreiro1, guerreiro2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBatalhaRpgactivity2Binding.inflate(layoutInflater)

        binding.txtNome1RPG.text = guerreiro1.nome
        binding.txtLive1RPG.text = guerreiro1.obterBarraVida().toString()

        binding.txtNome2RPG.text = guerreiro2.nome
        binding.txtLive2RPG.text = guerreiro2.obterBarraVida().toString()

        binding.btAtacar1RPG.setOnClickListener(){
            binding.txtStatusRPG.text = arena.decrementar(guerreiro2).toString()
            binding.txtLive2RPG.text = arena.obterBarraVida1(guerreiro2).toString()
        }

        binding.btAtacar2RPG.setOnClickListener(){
            binding.txtStatusRPG.text = arena.decrementar(guerreiro1).toString()
            binding.txtLive1RPG.text = arena.obterBarraVida1(guerreiro1).toString()
        }

        setContentView(binding.root)
    }
}