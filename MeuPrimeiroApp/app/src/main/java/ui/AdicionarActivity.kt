package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityAdicionarBinding
import model.Contato
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import repository.room.AppDatabase

class AdicionarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAdicionarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdicionarBinding.inflate(layoutInflater)

        binding.btSalvarAdicionarAgenda.setOnClickListener(){
            val nomeAdicionar = binding.txtEntradaNomeAgenda.text.toString()
            val telefoneAdicionar = binding.txtEntradaTelefoneAgenda.text.toString()
            val contatoAdicionar = Contato(nome = nomeAdicionar, telefone = telefoneAdicionar)

            doAsync {
                val db = AppDatabase.getDatabase(this@AdicionarActivity)
                db.contatoDao().insert(contatoAdicionar)
                uiThread {
                    Toast.makeText(this@AdicionarActivity, R.string.contato_salvo_sucesso, Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        }
        setContentView(binding.root)
    }
}