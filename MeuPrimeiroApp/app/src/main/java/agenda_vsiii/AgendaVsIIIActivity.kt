package agenda_vsiii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityAgendaVsIiiactivityBinding

class AgendaVsIIIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaVsIiiactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaVsIiiactivityBinding.inflate(layoutInflater)

        incializaLista()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, ListaContatosMelhoradaFragment())
            .commit()

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> {
                    loadFragments(ListaContatosMelhoradaFragment(), FRAGMENT_HOME)
                    true
                }
                R.id.ic_ajustes ->{
                    loadFragments(AjustesFragment(), FRAGMENT_AJUSTES)
                    true
                }
                else ->
                    false
            }
        }

        setContentView(binding.root)
    }
    private fun incializaLista() {
        AgendaIII.listaContatos.addAll(
            listOf(
                ContatosIII("Alex", "097984002561"),
                ContatosIII("Sabrina", "097987845612"),
                ContatosIII("Givanir", "097965235478"),
                ContatosIII("Jaqueline", "097956215784"),
                ContatosIII("Pain", "097985562164"),
                ContatosIII("Konan", "097986231452"),
                ContatosIII("Itachi", "097984125638"),
                ContatosIII("Kisame", "097985623148"),
                ContatosIII("Deidara", "097984009999"),
                ContatosIII("Sasori", "097984561111"),
                ContatosIII("Hidan", "097984561212"),
                ContatosIII("Kakuzu", "097984551313"),
                ContatosIII("Orochimaru", "097984001414"),
                ContatosIII("Zetsu", "097984001515"),
                ContatosIII("Madara", "097984001616"),
                ContatosIII("Sasuke", "097984122587"),
                ContatosIII("Killer", "097984889966"),
                ContatosIII("Kurama", "097984562763"),
                ContatosIII("Hashirama", "097984565251")
            )
        )
    }

    private fun loadFragments(fragment: Fragment, tag: String){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment, tag)
            commit()
        }
    }

    companion object {
        private const val FRAGMENT_HOME = "FRAGMENT_HOME"
        private const val FRAGMENT_AJUSTES = "FRAGMENT_AJUSTES"
    }
}