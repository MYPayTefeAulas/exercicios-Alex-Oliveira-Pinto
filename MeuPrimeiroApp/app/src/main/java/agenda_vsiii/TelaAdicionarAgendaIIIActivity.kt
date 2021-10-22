package agenda_vsiii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.databinding.ActivityTelaAdicionarAgendaIiiactivityBinding

class TelaAdicionarAgendaIIIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaAdicionarAgendaIiiactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaAdicionarAgendaIiiactivityBinding.inflate(layoutInflater)
        setTitle("Adicionar Contato")

        binding.btConcluidoAgendaIII.setOnClickListener(){
            val nome = binding.txtEntradaNomeAgendaIII.text.toString()
            val telefone = binding.txtEntradaTelefoneAgendaIII.text.toString()
            val pessoaAdicionar = ContatosIII(nome, telefone)
            AgendaIII.listaContatos.add(pessoaAdicionar)
            Toast.makeText(this, "Novo Contato Adicionado", Toast.LENGTH_SHORT).show()
            finish()
        }

        setContentView(binding.root)
    }
}