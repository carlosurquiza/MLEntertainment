package cl.cdum.mlentertainment.ui.errorView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import cl.cdum.mlentertainment.R
import cl.cdum.mlentertainment.databinding.FragmentApiServiceErrorBinding
import kotlin.system.exitProcess

class ApiServiceErrorFragment :
    Fragment(R.layout.fragment_api_service_error) {
    private var _binding: FragmentApiServiceErrorBinding? = null
    private val binding get() = _binding!!

    private val args: ApiServiceErrorFragmentArgs by navArgs()

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

        setupView()
        setupListener()
    }

    private fun setupView() {
        if (args.exitApplication) {
            binding.btnGoBack.text = getString(R.string.exit_application)
        }
    }

    private fun setupListener() {
        binding.apply {
            btnGoBack.setOnClickListener {
                if (args.exitApplication) {
                    exitApplication()
                } else {
                    goToHome()
                }
            }
        }
    }

    private fun exitApplication() {
        requireActivity().finish()
        exitProcess(0)
    }

    private fun goToHome() {
        val action =
            ApiServiceErrorFragmentDirections.actionApiServiceErrorFragmentToHomeFragment()
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}