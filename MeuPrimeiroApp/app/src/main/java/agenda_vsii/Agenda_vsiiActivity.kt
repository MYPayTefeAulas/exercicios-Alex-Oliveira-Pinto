package agenda_vsii

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuprimeiroapp.databinding.ActivityAgendaVsiiBinding
import greeter.PessoasActivity

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
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                Toast.makeText(this, "Erro, por favor digite um Nome e um Telefone", Toast.LENGTH_SHORT).show()
            } else if (novoContato.checarNomeVazio()){
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                Toast.makeText(this, "Erro, por favor digite um Nome", Toast.LENGTH_SHORT).show()
            } else if (novoContato.checarTelefoneVazio()){
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                Toast.makeText(this, "Erro, por favor digite um Telefone", Toast.LENGTH_SHORT).show()
            } else {
                binding.txtEntradaNomeAgendaII.setText("")
                binding.txtEntradaTelefoneAgendaII.setText("")
                Agenda_vsII.salvarContato(novoContato)
                Toast.makeText(this, "Novo contato Salvo!", Toast.LENGTH_LONG).show()
            }
        }

        binding.btDeletarAgendaII.setOnClickListener(){
            if(Agenda_vsII.checarAgendaVazia()){
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                Toast.makeText(this, "Erro, agenda vazia", Toast.LENGTH_SHORT).show()
            } else Agenda_vsII.deletarContato()
        }

        binding.btPesquisarAgendaII.setOnClickListener(){
            if(Agenda_vsII.checarAgendaVazia()){
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                binding.txtStatusAgendaII.text = "Erro, Nenhum contato para Pesquisar"
            }
        }

        binding.btImprimirAgendaII.setOnClickListener(){
            if(Agenda_vsII.checarAgendaVazia()){
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                binding.txtStatusAgendaII.text = "Erro, Nenhum contato para Imprimir"
            } else {
                binding.txtEntradaNomeAgendaII.setText(Agenda_vsII.imprimirNome())
                binding.txtEntradaTelefoneAgendaII.setText(Agenda_vsII.imprimirTelefone())
            }
        }

        binding.btEditarAgendaII.setOnClickListener(){
            if(Agenda_vsII.checarAgendaVazia()){
                binding.txtStatusAgendaII.setTextColor(corVermelha)
                binding.txtStatusAgendaII.text = "Erro, Nenhum contato para Editar"
            } else {
                val intent = Intent(this, EditarAgendaVsIIActivity::class.java)
                intent.putExtra("nomeEditar", Agenda_vsII.listaContatos[Agenda_vsII.indiceAtual - 1].nome)
                intent.putExtra("telefoneEditar", Agenda_vsII.listaContatos[Agenda_vsII.indiceAtual - 1].telefone)
                startActivity(intent)
                binding.txtEntradaNomeAgendaII.setText("")
                binding.txtEntradaTelefoneAgendaII.setText("")
            }
        }

        setContentView(binding.root)
    }

    companion object{
        val corVerde : Int = Color.rgb(12, 212, 12)
        val corVermelha : Int = Color.rgb(212, 12, 12)
    }
}