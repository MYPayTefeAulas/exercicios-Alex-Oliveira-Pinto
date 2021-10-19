package agenda_vsii

import agenda_vsi.Agenda
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.databinding.ActivityEditarAgendaIiactivityBinding
import com.example.meuprimeiroapp.databinding.ActivityEditarContatoBinding

class EditarAgendaIIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarAgendaIiactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditarAgendaIiactivityBinding.inflate(layoutInflater)
        setTitle("Editar")

        val indiceEditar: Int = intent.getIntExtra("indiceEditar", -1)!!
        val nomeEditar = Agenda_vsII.listaContatos[indiceEditar].nome
        val telefoneEditar = Agenda_vsII.listaContatos[indiceEditar].telefone

        binding.txtNomeEditarAgendaII.setText(nomeEditar)
        binding.txtTelefoneEditarAgendaII.setText(telefoneEditar)

        binding.btSalvarEditarAgendaII.setOnClickListener(){
            Agenda_vsII.listaContatos[indiceEditar].nome = binding.txtNomeEditarAgendaII.text.toString()
            Agenda_vsII.listaContatos[indiceEditar].telefone = binding.txtTelefoneEditarAgendaII.text.toString()
            Toast.makeText(this, "Contato Editado", Toast.LENGTH_SHORT).show()
            finish()
        }
        
        binding.btDeletarEditarAgendaII.setOnClickListener(){
            Agenda_vsII.deletarContato()
            Toast.makeText(this, "Contato Deletado", Toast.LENGTH_SHORT).show()
            finish()
        }

        setContentView(binding.root)
    }
}