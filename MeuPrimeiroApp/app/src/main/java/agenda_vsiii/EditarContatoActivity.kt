package agenda_vsiii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.databinding.ActivityEditarContatoBinding

class EditarContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditarContatoBinding.inflate(layoutInflater)
        setTitle("Editar Contato")

        val indiceContato = intent.getIntExtra("indiceContato", -1)
        val nome: String = AgendaIII.listaContatos[indiceContato].nome
        val telefone: String = AgendaIII.listaContatos[indiceContato].telefone
        binding.txtTelefone.setText(telefone)
        binding.txtNomeEditar.setText(nome)

        binding.btSalvarAgendaIII.setOnClickListener() {
            AgendaIII.listaContatos[indiceContato].nome = binding.txtNomeEditar.text.toString()
            AgendaIII.listaContatos[indiceContato].telefone = binding.txtTelefone.text.toString()
            Toast.makeText(this, "Contato Salvo com Sucesso!", Toast.LENGTH_SHORT).show()
            finish()
        }

        binding.btDeletarAgendaIII.setOnClickListener() {
            AgendaIII.listaContatos.removeAt(indiceContato)
            Toast.makeText(this, "Contato Deletado com Sucesso!", Toast.LENGTH_SHORT).show()
            finish()
        }
        setContentView(binding.root)
    }
}