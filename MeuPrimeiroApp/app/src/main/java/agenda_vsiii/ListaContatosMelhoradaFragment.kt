package agenda_vsiii

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.*
import com.example.meuprimeiroapp.databinding.FragmentListaContatosBinding

class ListaContatosMelhoradaFragment : Fragment(), SearchView.OnQueryTextListener {
    private var _binding: FragmentListaContatosBinding? = null

    private val binding get() = _binding!!

    private lateinit var adapter: ContatosAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListaContatosBinding.inflate(inflater, container, false)

        adapter = ContatosAdapter(mutableListOf(), ::onBtEditarClick)

        binding.rvContatos.layoutManager = LinearLayoutManager(context)
        binding.rvContatos.adapter = adapter
        binding.rvContatos.addItemDecoration(
            DividerItemDecoration(
                context,
                LinearLayoutManager.VERTICAL
            )
        )

        carregaLista()

        initTopBar()

        return binding.root
    }

    private fun carregaLista() {
        val config = requireActivity().getSharedPreferences("configuracoes", 0)
        val radioOrdenacaoSelecionada_id = config.getInt("ordenacaoContatos", R.id.radioOrdenacaoInsercao)
        when (radioOrdenacaoSelecionada_id) {
            R.id.radioOrdenacaoAZ -> {
                val listaOrdenada = AgendaIII.listaContatos.sortedBy { it.nome }
                adapter.swapData(listaOrdenada)
            }
            R.id.radioOrdenacaoZA -> {
                val listaOrdenada = AgendaIII.listaContatos.sortedByDescending { it.nome }
                adapter.swapData(listaOrdenada)
            }
            else -> {
                adapter.swapData(AgendaIII.listaContatos)
            }
        }
    }

    private fun initTopBar() {
        binding.toolbarContatos.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.toolbarContatosBusca -> {
                    val searchView = menuItem?.actionView as SearchView
                    searchView.queryHint = "Digite para pesquisar"
                    searchView.setOnQueryTextListener(this)
                    true
                }
                else -> false
            }
        }
    }


    override fun onQueryTextChange(newText: String?): Boolean =
        onQueryTextSubmit(newText) // vai buscar a cada letra digitada

    override fun onQueryTextSubmit(query: String?): Boolean {
        val queryLowerCase = query.toString().lowercase()

        val listaFiltrada = AgendaIII.listaContatos.filter { contatoAtual ->
            contatoAtual.nome.lowercase().contains(queryLowerCase) ||
                    contatoAtual.telefone.lowercase().contains(queryLowerCase)
        }

        adapter.swapData(listaFiltrada)
        return true
    }

    override fun onResume() {
        super.onResume()
        carregaLista()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun onBtEditarClick(indiceLista: Int) {
        val intent = Intent(context, EditarContatoActivity::class.java)
        intent.putExtra("indiceContato", indiceLista)
        startActivity(intent)
    }
}