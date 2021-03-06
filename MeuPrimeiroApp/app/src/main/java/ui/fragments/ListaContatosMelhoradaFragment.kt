package ui.fragments

import adapters.ContatosAdapter
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.*
import com.example.meuprimeiroapp.databinding.FragmentListaContatosBinding
import enuns.TipoOrdenacao
import model.Contato
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import repository.room.AppDatabase
import ui.EditarContatoActivity
import utils.IntentsConstants
import utils.PrefsConstants
import viewmodel.ListaContatosViewModel

class ListaContatosMelhoradaFragment : Fragment(), SearchView.OnQueryTextListener {
    private var _binding: FragmentListaContatosBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ContatosAdapter

    private lateinit var viewModel : ListaContatosViewModel

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

        doAsync {
            viewModel = ListaContatosViewModel(AppDatabase.getDatabase(requireContext()))
            val listaContatos = viewModel.getAllContatos()

            uiThread {
                carregaLista(listaContatos)
            }
        }


        initTopBar()

        return binding.root
    }

    private fun carregaLista(listaContatos: List<Contato>) {
        val config = requireActivity().getSharedPreferences(PrefsConstants.FILE_CONFIGURACOES, 0)
        val ordenacaoSelecionada_str = config.getString(
            PrefsConstants.KEY_TIPO_ORDENACAO_CONTATOS,
            TipoOrdenacao.ORDEM_INSERCAO.toString()
        )
        val ordenacaoSelecionada: TipoOrdenacao = TipoOrdenacao.valueOf(ordenacaoSelecionada_str!!)
        when (ordenacaoSelecionada) {
            TipoOrdenacao.ALFABETICA_AZ -> {
                val listaOrdenada = listaContatos.sortedBy { it.nome }
                adapter.swapData(listaOrdenada)
            }
            TipoOrdenacao.ALFABETICA_ZA -> {
                val listaOrdenada = listaContatos.sortedByDescending { it.nome }
                adapter.swapData(listaOrdenada)
            }
            TipoOrdenacao.ORDEM_INSERCAO -> {
                adapter.swapData(listaContatos)
            }
        }
    }

    private fun initTopBar() {
        binding.toolbarContatos.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.toolbarContatosBusca -> {
                    val searchView = menuItem?.actionView as SearchView
                    searchView.queryHint = getString(R.string.digite_para_pesquisar)
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

        doAsync {
            val db = AppDatabase.getDatabase(requireActivity().applicationContext)
            val contatoList = db.contatoDao().getAllContatos()

            uiThread {
                val listaFiltrada = contatoList.filter { contatoAtual ->
                    contatoAtual.nome.lowercase().contains(queryLowerCase) ||
                            contatoAtual.telefone.lowercase().contains(queryLowerCase)
                }
                adapter.swapData(listaFiltrada)
            }
        }
        return true
    }

    override fun onResume() {
        super.onResume()
        doAsync {
            val listaContatos = viewModel.getAllContatos()

            uiThread {
                carregaLista(listaContatos)
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun onBtEditarClick(indiceLista: Int) {
        val intent = Intent(context, EditarContatoActivity::class.java)
        val contatoSelecionado = adapter.listaContatos[indiceLista]
        val idContato = contatoSelecionado.id
        intent.putExtra(IntentsConstants.LONG_ID_CONTATO, idContato)
        startActivity(intent)
    }
}
