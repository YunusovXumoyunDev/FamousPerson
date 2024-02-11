package uz.smt.famouspersons.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import uz.smt.famouspersons.R
import uz.smt.famouspersons.databinding.FragmentFamousFirstBinding

class FamousFirstFragment : Fragment() {
    private var _binding: FragmentFamousFirstBinding? = null
    private val binding: FragmentFamousFirstBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFamousFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.toolbar.setNavigationOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}
