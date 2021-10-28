package agenda_vsiii

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.FragmentListaContatosBinding

class ListaContatosFragment: Fragment() {
    private var _binding: FragmentListaContatosBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ContatosAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
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



        return binding.root
    }

    fun onBtEditarClick(indiceLista: Int) {
        val intent = Intent(context, EditarContatoActivity::class.java)
        intent.putExtra("indiceContato", indiceLista)
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        adapter.swapData(AgendaIII.listaContatos)
    }

}
//-----11111.22222.97981023141.5555