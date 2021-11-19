package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityEditarContatoBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import model.Contato
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import repository.room.AppDatabase
import utils.IntentsConstants
import viewmodel.EditarContatoViewModel

class EditarContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditarContatoBinding
    private lateinit var viewModel: EditarContatoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditarContatoBinding.inflate(layoutInflater)
        setTitle(getString(R.string.editar_contato))

        val idContato = intent.getLongExtra(IntentsConstants.LONG_ID_CONTATO, -1)

        doAsync {
            viewModel = EditarContatoViewModel(AppDatabase.getDatabase(this@EditarContatoActivity))
            val contatoEditando = viewModel.getContatoById(idContato)
            initElementos(contatoEditando)
        }

        setContentView(binding.root)
    }

    fun initElementos(contatoEditando: Contato){

        val nome: String = contatoEditando.nome
        val telefone: String = contatoEditando.telefone

        binding.txtTelefone.setText(telefone)
        binding.txtNomeEditar.setText(nome)
        binding.switchContatoFavorito.isChecked = contatoEditando.favorito

        binding.btSalvarAgendaIII.setOnClickListener() {
            contatoEditando.nome = binding.txtNomeEditar.text.toString()
            contatoEditando.telefone = binding.txtTelefone.text.toString()
            doAsync {
                viewModel.saveContato(contatoEditando)
                uiThread {
                    Toast.makeText(this@EditarContatoActivity, getString(R.string.contato_salvo_sucesso), Toast.LENGTH_SHORT).show()
                    finish()
                }
            }

        }

        binding.btDeletarAgendaIII.setOnClickListener() {
            MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.deletar_contato))
                .setMessage(getString(R.string.realmente_deletar))
                .setNegativeButton(getString(R.string.cancelar), null)
                .setPositiveButton(getString(R.string.deletar)) { _,_ ->
                    doAsync {
                        viewModel.deletecontato(contatoEditando)
                        uiThread {
                            Toast.makeText(this@EditarContatoActivity, getString(R.string.contato_deletado), Toast.LENGTH_SHORT ).show()
                            finish()
                        }
                    }
                }.show()
        }

        binding.switchContatoFavorito.setOnCheckedChangeListener { _, isChecked ->
            contatoEditando.favorito = isChecked
            doAsync {
                viewModel.saveContato(contatoEditando)
            }
        }
    }
}