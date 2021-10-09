package greeter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuprimeiroapp.databinding.ActivityTelaIiactivityBinding

class TelaIIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaIiactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaIiactivityBinding.inflate(layoutInflater)

        binding.btValidarTelaII.setOnClickListener(){
            val intent = Intent(this, TelaIIIActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}