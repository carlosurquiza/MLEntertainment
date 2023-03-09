package cl.cdum.mlentertainment.ui.categoryItemDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import cl.cdum.ccladevelopers.util.Resource
import cl.cdum.mlentertainment.R
import cl.cdum.mlentertainment.data.model.categoryItemDetail.CategoryItemDetailData
import cl.cdum.mlentertainment.databinding.FragmentCategoryItemDetailBinding
import cl.cdum.mlentertainment.util.extensions.currencyFormat
import cl.cdum.mlentertainment.util.extensions.gone
import cl.cdum.mlentertainment.util.extensions.visible
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryItemDetailFragment : Fragment(R.layout.fragment_category_item_detail) {
    private var _binding: FragmentCategoryItemDetailBinding? = null
    private val binding get() = _binding!!

    private val args: CategoryItemDetailFragmentArgs by navArgs()
    private val categoryItemDetailViewModel: CategoryItemDetailViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryItemDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        initObservers()
    }

    private fun setupView() {
        categoryItemDetailViewModel.getCategoryItemDetail(args.id)
    }

    private fun initObservers() {
        categoryItemDetailViewModel.liveData.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Error -> showErrorView(result.error)
                is Resource.Loading -> showLoadingView()
                is Resource.Success -> showSuccessView(result.data!!)
            }
        }
    }

    private fun showErrorView(error: Throwable?) {
        goToApiServiceErrorFragment()
    }

    private fun showLoadingView() {
        binding.progressBar.visible()
    }

    private fun showSuccessView(data: CategoryItemDetailData?) {
        binding.apply {
            progressBar.gone()

            data.apply {
                Glide.with(this@CategoryItemDetailFragment)
                    .load(this!!.secure_thumbnail)
                    .into(ivPhoto)

                tvId.text = id
                tvTitle.text = title
                tvCondition.text = getString(R.string.condition, condition)
                tvWarranty.text = warranty
                tvPrice.text = price!!.toLong().currencyFormat()
                tvAvailableQuantity.text = getString(
                    R.string.available_quantity,
                    available_quantity.toString()
                )
            }
        }
    }

    private fun goToApiServiceErrorFragment() {
        binding.progressBar.gone()

        val action =
            CategoryItemDetailFragmentDirections.actionCategoryItemDetailFragmentToApiServiceErrorFragment()
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}