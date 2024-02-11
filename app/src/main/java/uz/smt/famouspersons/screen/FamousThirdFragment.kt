package uz.smt.famouspersons.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.smt.famouspersons.R
import uz.smt.famouspersons.databinding.FragmentFamousSecondBinding
import uz.smt.famouspersons.databinding.FragmentFamousThirdBinding

class FamousThirdFragment : Fragment() {
    private var _binding: FragmentFamousThirdBinding? = null
    private val binding: FragmentFamousThirdBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentFamousThirdBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.toolbar.setNavigationOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}