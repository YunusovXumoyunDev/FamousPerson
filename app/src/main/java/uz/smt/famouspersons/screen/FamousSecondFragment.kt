package uz.smt.famouspersons.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.smt.famouspersons.R
import uz.smt.famouspersons.databinding.FragmentFamousFirstBinding
import uz.smt.famouspersons.databinding.FragmentFamousSecondBinding

class FamousSecondFragment : Fragment() {
    private var _binding: FragmentFamousSecondBinding? = null
    private val binding: FragmentFamousSecondBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFamousSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.toolbar.setNavigationOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

}