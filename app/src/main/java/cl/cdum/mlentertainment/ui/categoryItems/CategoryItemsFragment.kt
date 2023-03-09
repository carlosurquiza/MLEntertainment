package cl.cdum.mlentertainment.ui.categoryItems

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import cl.cdum.ccladevelopers.util.Resource
import cl.cdum.mlentertainment.R
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryItemsData
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryResult
import cl.cdum.mlentertainment.databinding.FragmentCategoryItemsBinding
import cl.cdum.mlentertainment.util.CATEGORY_ID
import cl.cdum.mlentertainment.util.extensions.gone
import cl.cdum.mlentertainment.util.extensions.hideKeyboard
import cl.cdum.mlentertainment.util.extensions.visible
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryItemsFragment :
    Fragment(R.layout.fragment_category_items),
    CategoryItemsAdapter.OnItemClickListener {
    private var _binding: FragmentCategoryItemsBinding? = null
    private val binding get() = _binding!!

    private val args: CategoryItemsFragmentArgs by navArgs()

    private val categoryItemsViewModel: CategoryItemsViewModel by viewModels()
    private lateinit var categoryItemsAdapter: CategoryItemsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryItemsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        setupListener()
        initObservers()
    }

    private fun setupView() {
        categoryItemsAdapter = CategoryItemsAdapter(this@CategoryItemsFragment)

        binding.apply {
            etSearch.setText(args.searchCriteria)

            rvItems.apply {
                adapter = categoryItemsAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }

        onSearch()
    }

    private fun setupListener() {
        binding.apply {
            etSearch.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    onSearch()
                }
                true
            }

            ivSearch.setOnClickListener { onSearch() }
        }
    }

    private fun onSearch() {
        val searchCriteria = binding.etSearch.text.toString()

        if (searchCriteria.isNotEmpty()) {
            hideKeyboard()
            categoryItemsViewModel.onSearch(searchCriteria)
        }
    }

    private fun initObservers() {
        categoryItemsViewModel.liveData.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Error -> showErrorView(result.error)
                is Resource.Loading -> showLoadingView()
                is Resource.Success -> showSuccessView(result.data)
            }
        }

        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            categoryItemsViewModel.event.collect { event ->
                when (event) {
                    is CategoryItemsEvent.NavigateToItemDetail -> {
                        val action =
                            CategoryItemsFragmentDirections.actionCategoryItemsFragmentToCategoryItemDetailFragment(
                                id = event.id
                            )
                        findNavController().navigate(action)
                    }
                    is CategoryItemsEvent.NavigateToCategoryItems -> {
                        categoryItemsViewModel.getCategoryItemsSearch(event.searchCriteria)
                    }
                }
            }
        }
    }

    private fun showErrorView(error: Throwable?) {
        goToApiServiceErrorFragment()
    }

    private fun showLoadingView() {
        binding.progressBar.visible()
    }

    private fun showSuccessView(data: CategoryItemsData?) {
        binding.apply {
            progressBar.gone()

            if (data!!.results!!.isEmpty()) {
                rvItems.gone()
                ivNoResults.visible()
            } else {
                rvItems.visible()
                ivNoResults.gone()

                categoryItemsAdapter.submitList(data.results)
            }
        }
    }

    private fun goToApiServiceErrorFragment() {
        binding.progressBar.gone()

        val action =
            CategoryItemsFragmentDirections.actionCategoryItemsFragmentToApiServiceErrorFragment(
                exitApplication = false
            )
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(result: CategoryResult) {
        categoryItemsViewModel.onItemSelected(result.id!!)
    }
}