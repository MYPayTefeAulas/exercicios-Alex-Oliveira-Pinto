package greeter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.R
import com.example.meuprimeiroapp.databinding.ActivityTelaIactivityBinding

class telaIActivity : AppCompatActivity() {
    private lateinit var binding :ActivityTelaIactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaIactivityBinding.inflate(layoutInflater)

        binding.btTelaIEntrar.setOnClickListener(){
            val intent = Intent(this, TelaIIActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}