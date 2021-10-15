package agenda_vsii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityEditarAgendaVsIiactivityBinding
import greeter.Pessoa

class EditarAgendaVsIIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarAgendaVsIiactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditarAgendaVsIiactivityBinding.inflate(layoutInflater)
        setTitle("Editar Agenda II")

        val nome : String = intent.getStringExtra("nomeEditar")!!
        val telefone : String = intent.getStringExtra("telefoneEditar")!!
        binding.txtEditaNomeAgendaVsII.setText(nome)
        binding.txtEditarTelefoneAgendaVsII.setText(telefone)

        binding.btSalvarEditarAgendaVsII.setOnClickListener(){
            val nomeEditar = binding.txtEditaNomeAgendaVsII.text.toString()
            val telefoneEditar = binding.txtEditarTelefoneAgendaVsII.text.toString()

            Agenda_vsII.listaContatos[Agenda_vsII.indiceAtual -1].nome = nomeEditar
            Agenda_vsII.listaContatos[Agenda_vsII.indiceAtual -1].telefone = telefoneEditar
            finish()
        }

        setContentView(binding.root)
    }
}