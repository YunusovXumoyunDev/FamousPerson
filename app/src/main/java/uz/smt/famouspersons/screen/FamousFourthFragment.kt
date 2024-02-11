package uz.smt.famouspersons.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.smt.famouspersons.R
import uz.smt.famouspersons.databinding.FragmentFamousFirstBinding
import uz.smt.famouspersons.databinding.FragmentFamousFourthBinding

class FamousFourthFragment : Fragment() {
    private var _binding: FragmentFamousFourthBinding? = null
    private val binding: FragmentFamousFourthBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFamousFourthBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.toolbar.setNavigationOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}