package greeter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    private val agenda = Agenda()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaBinding.inflate(layoutInflater)

        binding.btSalvarAgenda.setOnClickListener() {
            val nome = binding.txtEntradaNomeAgenda.text.toString()
            val telefone = binding.txtEntradaTelefoneAgenda.text.toString()
            val pessoa = Pessoa(nome, 0, telefone)

            if(pessoa.verificaNomeVazio()&&pessoa.verificaTelefoneVazio()){
                binding.txtStatusAgenda.setTextColor(corVermelha)
                binding.txtStatusAgenda.text = "Erro, digite um nome e um telefone"
            } else if (pessoa.verificaNomeVazio()){
                binding.txtStatusAgenda.setTextColor(corVermelha)
                binding.txtStatusAgenda.text = "Erro, digite um nome "
            } else if (pessoa.verificaTelefoneVazio()){
                binding.txtStatusAgenda.setTextColor(corVermelha)
                binding.txtStatusAgenda.text = "Erro, digite um telefone"
            } else if(agenda.testarContato(pessoa)){
                binding.txtStatusAgenda.setTextColor(corVerde)
                binding.txtStatusAgenda.text = "Erro. contato já existe"
            } else{
                binding.txtStatusAgenda.setTextColor(corVerde)
                binding.txtEntradaNomeAgenda.setText("")
                binding.txtEntradaTelefoneAgenda.setText("")
                agenda.salvarContato(pessoa)
                binding.txtStatusAgenda.text = "Novo contato salvo "

            }







































//            if(pessoa.verificaNomeVazio()&&pessoa.verificaTelefoneVazio()) {
//                binding.txtStatusAgenda.setTextColor(corVermelha)
//                binding.txtStatusAgenda.text = "Erro, por favor digite um Nome e um telefone"
//            } else if(pessoa.verificaNomeVazio()) {
//                binding.txtStatusAgenda.setTextColor(corVermelha)
//                binding.txtStatusAgenda.text = "Erro, por favor digite um Nome"
//            } else if(pessoa.verificaTelefoneVazio()) {
//                binding.txtStatusAgenda.setTextColor(corVermelha)
//                binding.txtStatusAgenda.text = "Erro, por favor digite um Telefone"
//            } else if(!agenda.testarContato(pessoa)) {
//                agenda.salvarContato(pessoa)
//                binding.txtStatusAgenda.setTextColor(corVerde)
//                binding.txtStatusAgenda.text = "Contato salvo : ${pessoa.nome}!!!"
//                binding.txtEntradaNomeAgenda.setText("")
//                binding.txtEntradaTelefoneAgenda.setText("")
//            } else {
//                binding.txtStatusAgenda.setTextColor(corVermelha)
//                binding.txtStatusAgenda.text = "Erro, contato repetido"
//            }
        }

        binding.btImprimirAgenda.setOnClickListener() {
            binding.txtStatusAgenda.setText("")
            if(agenda.checarVazio()) {
                binding.txtStatusAgenda.setTextColor(corVermelha)
                binding.txtStatusAgenda.text = "Nenhum contato salvo para IMPRIMIR"
            } else {
                binding.txtEntradaNomeAgenda.setText(agenda.imprimirNomeContatos())
                binding.txtEntradaTelefoneAgenda.setText(agenda.imprimirTelefoneContatos())
            }
        }

        binding.btDeletarAgenda.setOnClickListener() {
            binding.txtEntradaNomeAgenda.setText("")
            binding.txtEntradaTelefoneAgenda.setText("")
            binding.txtStatusAgenda.setText("")
            if(agenda.checarVazio()) {
                binding.txtStatusAgenda.setTextColor(corVermelha)
                binding.txtStatusAgenda.text = "Nenhum contato salvo para DELETAR"
            } else agenda.deletarContato()
        }

        binding.btPesquisarAgenda.setOnClickListener(){
            val nomePesquisar = binding.txtEntradaNomePesquisarAgenda.text.toString()
            val pessoaPesquisar = Pessoa(nomePesquisar, 0, "")

            if(agenda.checarVazio()){
                binding.txtStatusAgenda.text = "Erro, nenhum contato salvo"
            }else if(!agenda.pesquisarContato(pessoaPesquisar)){
                binding.txtStatusAgenda.text = "Contato não encontrado"
            } else {
                binding.txtStatusAgenda.text = "Contato encontrado"
                binding.txtEntradaNomeAgenda.setText(agenda.imprimirNomeContatosPesquisa(pessoaPesquisar))
                binding.txtEntradaTelefoneAgenda.setText(agenda.imprimirTelefoneContatosPesquisa(pessoaPesquisar))
            }


        }











//        binding.btPesquisarAgenda.setOnClickListener() {
//            val nomePesquisar = binding.txtEntradaNomePesquisarAgenda.text.toString()
//            val pessoaPesquisar = Pessoa(nomePesquisar, 0,"")
//
//            if(agenda.checarVazio()){
//                binding.txtStatusAgenda.setTextColor(corVermelha)
//                binding.txtStatusAgenda.text = "Nenhum contato salvo para PESQUISAR"
//            } else if(!agenda.pesquisarContato(pessoaPesquisar)) {
//                binding.txtStatusAgenda.setTextColor(corVermelha)
//                binding.txtStatusAgenda.text = "Contato não encontrado"
//                binding.txtEntradaNomeAgenda.setText("")
//                binding.txtEntradaTelefoneAgenda.setText("")
//            } else {
//                binding.txtStatusAgenda.setTextColor(corVerde)
//                binding.txtStatusAgenda.text = "Contato encontrado"
//                binding.txtEntradaNomeAgenda.setText(agenda.imprimirNomeContatosPesquisa(pessoaPesquisar))
//                binding.txtEntradaTelefoneAgenda.setText(agenda.imprimirTelefoneContatosPesquisa(pessoaPesquisar))
//            }
//        }

        setContentView(binding.root)
    }

    companion object {
        val corVermelha : Int = Color.rgb(212,12,12)
        val corVerde : Int = Color.rgb(12,212,12)
    }





































//    companion object {
//        val corVermelha: Int = Color.rgb(212, 12, 12)
//        val corVerde: Int = Color.rgb(12, 212, 12)
//    }
}




