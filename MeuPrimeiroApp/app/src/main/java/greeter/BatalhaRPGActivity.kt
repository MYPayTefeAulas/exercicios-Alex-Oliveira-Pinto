package greeter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityBatalhaRpgactivity2Binding

class BatalhaRPGActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBatalhaRpgactivity2Binding
    private val guerreiro1 = Guerreiro("Alex", 0, 25)
    private val guerreiro2 = Guerreiro("Oliveira", 0, 25)
    private val arena = Arena(guerreiro1, guerreiro2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBatalhaRpgactivity2Binding.inflate(layoutInflater)

        binding.txtNome1RPG.text = guerreiro1.nome
        binding.txtNome1RPG.setTextColor(Color.rgb(12,210,12))
        binding.txtLive1RPG.text = guerreiro1.obterBarraVida().toString()

        binding.txtNome2RPG.text = guerreiro2.nome
        binding.txtNome2RPG.setTextColor(Color.rgb(12,10,212))
        binding.txtLive2RPG.text = guerreiro2.obterBarraVida().toString()

        binding.btAtacar1RPG.setOnClickListener(){

            if(arena.decrementar(guerreiro2) == 0) {
                binding.txtStatusRPG.setTextColor(Color.rgb(22, 212,12))
                binding.txtStatusRPG.text = "Guerreiro ${guerreiro1.nome} Campeão"
                binding.txtLive2RPG.text = "[]"

            } else if (arena.incrementarNataque().mod(2) == 0) {
                binding.txtStatusRPG.setTextColor(Color.rgb(212,12,12))
                binding.txtStatusRPG.text = "Não é a sua vez de atacar ${guerreiro1.nome}"
                arena.decrementarNAtaque()

            } else binding.txtLive2RPG.text = arena.obterBarraVida1(guerreiro2).toString()
        }

        binding.btAtacar2RPG.setOnClickListener(){

            if(arena.decrementar(guerreiro1) == 0) {
                binding.txtStatusRPG.setTextColor(Color.rgb(12,10,212))
                binding.txtStatusRPG.text = "Guerreiro ${guerreiro2.nome} Campeão"
                binding.txtLive1RPG.text = "[]"

        } else if(arena.incrementarNataque().mod(2) == 1){
                binding.txtStatusRPG.setTextColor(Color.rgb(212,12,12))
                binding.txtStatusRPG.text = "Não é a sua vez de atacar ${guerreiro2.nome}"
                arena.decrementarNAtaque()

            } else binding.txtLive1RPG.text = arena.obterBarraVida1(guerreiro1).toString()
        }

        setContentView(binding.root)
    }
}