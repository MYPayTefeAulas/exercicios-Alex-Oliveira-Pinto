package agenda_vsii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.databinding.ActivityAgendaVsiiBinding


class Agenda_vsiiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaVsiiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaVsiiBinding.inflate(layoutInflater)
        setTitle("Agenda II")

        binding.btSalvarAgendaII.setOnClickListener(){
            val recebeNome = binding.txtEntradaNomeAgendaII.text.toString()
            val recebeTelefone = binding.txtEntradaTelefoneAgendaII.text.toString()
            val novoContato = Contato_vsII(recebeNome, recebeTelefone)

            if((novoContato.checarNomeVazio())&&(novoContato.checarTelefoneVazio())){
                Toast.makeText(this, "Erro, por favor digite um Nome e um Telefone", Toast.LENGTH_SHORT).show()
            } else if (novoContato.checarNomeVazio()){
                Toast.makeText(this, "Erro, por favor digite um Nome", Toast.LENGTH_SHORT).show()
            } else if (novoContato.checarTelefoneVazio()){
                Toast.makeText(this, "Erro, por favor digite um Telefone", Toast.LENGTH_SHORT).show()
            } else if (Agenda_vsII.verificaRepetido(novoContato)){
                Toast.makeText(this, "Contato Repetido", Toast.LENGTH_SHORT).show()
            } else {
                binding.txtEntradaNomeAgendaII.setText("")
                binding.txtEntradaTelefoneAgendaII.setText("")
                Agenda_vsII.salvarContato(novoContato)
                Toast.makeText(this, "Novo contato Salvo!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btImprimirAgendaII.setOnClickListener(){
            if(Agenda_vsII.checarAgendaVazia()){
                Toast.makeText(this, "Erro, nenhum contato para Imprimir", Toast.LENGTH_SHORT).show()
            } else {
                binding.txtEntradaNomeAgendaII.setText(Agenda_vsII.imprimirNome())
                binding.txtEntradaTelefoneAgendaII.setText(Agenda_vsII.imprimirTelefone())
            }
        }

        binding.btEditarAgendaII.setOnClickListener(){
            val nomeEditar = binding.txtEntradaNomeAgendaII.text.toString()
            val telefoneEditar = binding.txtEntradaTelefoneAgendaII.text.toString()
            val contatoEditar = Contato_vsII(nomeEditar, telefoneEditar)

            if(Agenda_vsII.checarAgendaVazia()){
                Toast.makeText(this, "Erro, nenhum contato para Editar", Toast.LENGTH_SHORT).show()
            } else if (contatoEditar.checarNomeVazio()&&contatoEditar.checarTelefoneVazio()){
                Toast.makeText(this, "Nenhum contato selecionado", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, EditarAgendaIIActivity::class.java)
                intent.putExtra("indiceEditar", Agenda_vsII.indiceAtual - 1)
                startActivity(intent)

                binding.txtEntradaNomeAgendaII.setText("")
                binding.txtEntradaTelefoneAgendaII.setText("")
            }
        }

        binding.btImprimirTodosAgendaII.setOnClickListener(){
            if(Agenda_vsII.checarAgendaVazia()){
                Toast.makeText(this, "Nenhum contato savo", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ListaContatosActivity::class.java)
                startActivity(intent)
            }
        }

        setContentView(binding.root)
    }
}