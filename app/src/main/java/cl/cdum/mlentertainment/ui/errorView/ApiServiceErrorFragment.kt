package cl.cdum.mlentertainment.ui.errorView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cl.cdum.mlentertainment.R
import cl.cdum.mlentertainment.databinding.FragmentApiServiceErrorBinding

class ApiServiceErrorFragment :
    Fragment(R.layout.fragment_api_service_error)
{
    private var _binding: FragmentApiServiceErrorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentApiServiceErrorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListener()
    }

    private fun setupListener() {
        binding.apply {
            btnGoBack.setOnClickListener { goBack() }
        }
    }

    private fun goBack() {
        findNavController().navigateUp()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}