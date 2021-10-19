package agenda_vsiii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.databinding.ActivityAgendaVsIiiactivityBinding

class AgendaVsIIIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaVsIiiactivityBinding
    private lateinit var adapter: ContatosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaVsIiiactivityBinding.inflate(layoutInflater)

        incializaLista()

        adapter = ContatosAdapter(mutableListOf(),::onBtEditarClick)

        binding.rvContatos.layoutManager = LinearLayoutManager(this)
        binding.rvContatos.adapter = adapter
        binding.rvContatos.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        setContentView(binding.root)
    }

    private fun incializaLista() {
        AgendaIII.listaContatos.addAll(
            listOf(
                ContatosIII("1 Alex", "1111"),
                ContatosIII("2 Sabrina", "22222"),
                ContatosIII("3 Jaqueline", "33333"),
                ContatosIII("4 Jaqueline", "4444")
            )
        )
    }

    fun onBtEditarClick(indiceLista: Int) {
        val intent = Intent(this, EditarContatoActivity::class.java)
        intent.putExtra("indiceContato", indiceLista)
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        adapter.swapData(AgendaIII.listaContatos)
    }
}