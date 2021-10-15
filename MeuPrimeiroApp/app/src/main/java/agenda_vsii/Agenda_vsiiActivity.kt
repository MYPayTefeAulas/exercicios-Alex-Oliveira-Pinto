package greeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityAgendaVsiiBinding

class Agenda_vsiiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaVsiiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendaVsiiBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}