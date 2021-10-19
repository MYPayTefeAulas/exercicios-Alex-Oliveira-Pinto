package agenda_vsii

import agenda_vsiii.AgendaIII
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.databinding.ActivityListaContatosBinding

class ListaContatosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListaContatosBinding
    private lateinit var adapter: ContatosAgendaIIAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaContatosBinding.inflate(layoutInflater)
        adapter = ContatosAgendaIIAdapter(mutableListOf(),::onItemClicked)
        setTitle("Todos os Contatos")

        binding.rvListaContatosAgendaII.layoutManager = LinearLayoutManager(this)
        binding.rvListaContatosAgendaII.adapter = adapter
        binding.rvListaContatosAgendaII.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        setContentView(binding.root)
    }

    fun onItemClicked(indiceLista: Int){
        val intent = Intent(this, EditarAgendaIIActivity::class.java)
        intent.putExtra("indiceEditar", indiceLista)
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        adapter.swapData(Agenda_vsII.listaContatos)
    }
}