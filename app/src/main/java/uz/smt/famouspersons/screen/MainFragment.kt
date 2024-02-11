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
import uz.smt.famouspersons.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.secondItem.name.text = "Mavlono Lutfiy"
        binding.secondItem.image.setImageResource(R.drawable.lutfiy)
        binding.thirdItem.name.text = "Imom Buxoriy"
        binding.thirdItem.image.setImageResource(R.drawable.imom_buxoriy)
        binding.fourthItem.name.text = "Mahmudxo'ja Behbudiy"
        binding.fourthItem.image.setImageResource(R.drawable.behbudiy)
        binding.firstItem.layoutBtn.setOnClickListener {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment,
                    FamousFirstFragment(),
                    "Famous first"
                )
                addToBackStack(null)
            }
        }
        binding.secondItem.layoutBtn.setOnClickListener {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment,
                    FamousSecondFragment(),
                    "Famous second"
                )
                addToBackStack(null)
            }
        }
        binding.thirdItem.layoutBtn.setOnClickListener {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment,
                    FamousThirdFragment(),
                    "Famous third"
                )
                addToBackStack(null)
            }
        }
        binding.fourthItem.layoutBtn.setOnClickListener {
            parentFragmentManager.commit {
                replace(
                    R.id.fragment,
                    FamousFourthFragment(),
                    "Famous third"
                )
                addToBackStack(null)
            }
        }
    }
}