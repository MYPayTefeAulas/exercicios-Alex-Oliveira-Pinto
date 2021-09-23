package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding
    private var nome = ""
    private var idade = 0
    private var listaPessoas = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPessoasBinding.inflate(layoutInflater)
        binding.btImprimir.setOnClickListener(){
            binding.txtSaidaImprimir.text = imprimirPessoa()
        }

        binding.btSalvar.setOnClickListener(){
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()
            val pessoa = Pessoa(nome, idade, telefone = null)
            listaPessoas.add(pessoa)
        }
        setContentView(binding.root)
    }

    fun imprimirPessoa(): String{
        if(indiceAtual >= listaPessoas.size)
            indiceAtual = 0
        val pessoaAtual = listaPessoas[indiceAtual]
        indiceAtual++
        return "${pessoaAtual.nome}, ${pessoaAtual.idade}"
    }
}