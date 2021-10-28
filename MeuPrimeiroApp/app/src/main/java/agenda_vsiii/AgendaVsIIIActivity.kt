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
                ContatosIII("1 Alex", "097984002561"),
                ContatosIII("2 Sabrina", "097987845612"),
                ContatosIII("3 Givanir", "097965235478"),
                ContatosIII("4 Jaqueline", "097956215784"),
                ContatosIII("5 Pain", "097985562164"),
                ContatosIII("6 Konan", "097986231452"),
                ContatosIII("7 Itachi", "097984125638"),
                ContatosIII("8 Kisame", "097985623148"),
                ContatosIII("9 Deidara", "097984009999"),
                ContatosIII("10 Sasori", "097984561111"),
                ContatosIII("11 Hidan", "097984561212"),
                ContatosIII("12 Kakuzu", "097984551313"),
                ContatosIII("13 Orochimaru", "097984001414"),
                ContatosIII("14 Zetsu", "097984001515"),
                ContatosIII("15 Madara", "097984001616"),
                ContatosIII("16 Sasuke", "097984122587"),
                ContatosIII("17 Killer Bee", "097984889966"),
                ContatosIII("18 Kurama", "097984562763"),
                ContatosIII("19 Hashirama", "097984565251")
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