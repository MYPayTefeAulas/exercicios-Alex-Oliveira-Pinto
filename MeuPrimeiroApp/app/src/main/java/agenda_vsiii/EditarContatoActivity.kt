package agenda_vsiii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityEditarContatoBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class EditarContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContatoBinding.inflate(layoutInflater)

        setTitle(getString(R.string.editar_contato))

        val indiceContato = intent.getIntExtra("indiceContato", -1)

        val nome: String = AgendaIII.listaContatos[indiceContato].nome
        val telefone: String = AgendaIII.listaContatos[indiceContato].telefone
        binding.txtTelefone.setText(telefone)
        binding.txtNomeEditar.setText(nome)
        binding.switchContatoFavorito.isChecked = AgendaIII.listaContatos[indiceContato].favorito

        binding.btSalvarAgendaIII.setOnClickListener() {
            AgendaIII.listaContatos[indiceContato].nome = binding.txtNomeEditar.text.toString()
            AgendaIII.listaContatos[indiceContato].telefone = binding.txtTelefone.text.toString()
            Toast.makeText(this, getString(R.string.contato_salvo_sucesso), Toast.LENGTH_SHORT).show()
            finish()
        }

        binding.btDeletarAgendaIII.setOnClickListener() {
            MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.deletar_contato))
                .setMessage(getString(R.string.realmente_deletar))
                .setNegativeButton(getString(R.string.cancelar), null)
                .setPositiveButton(getString(R.string.deletar)) { _,_ ->
                    AgendaIII.listaContatos.removeAt(indiceContato)
                    Toast.makeText(this, getString(R.string.contato_deletado), Toast.LENGTH_SHORT ).show()
                    finish()
                }.show()
        }

        binding.switchContatoFavorito.setOnCheckedChangeListener { _, isChecked ->
            AgendaIII.listaContatos[indiceContato].favorito = isChecked

        }

        setContentView(binding.root)
    }
}