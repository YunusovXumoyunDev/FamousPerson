package uz.smt.famouspersons.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import uz.smt.famouspersons.model.FamousRepository
import uz.smt.famouspersons.databinding.ActivityMainBinding
import uz.smt.famouspersons.model.FamousData

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!
    private var repository = FamousRepository()
    private var ls = repository.getFamous()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(binding.fragment.id, MainFragment(), "Famous first")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}















