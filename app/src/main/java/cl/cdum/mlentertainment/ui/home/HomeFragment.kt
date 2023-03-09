package cl.cdum.mlentertainment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import cl.cdum.ccladevelopers.util.Resource
import cl.cdum.mlentertainment.R
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryItemsData
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryResult
import cl.cdum.mlentertainment.data.model.homeCategories.HomeCategoriesData
import cl.cdum.mlentertainment.databinding.FragmentHomeBinding
import cl.cdum.mlentertainment.ui.categoryItems.CategoryItemsAdapter
import cl.cdum.mlentertainment.ui.categoryItems.CategoryItemsEvent
import cl.cdum.mlentertainment.ui.categoryItems.CategoryItemsViewModel
import cl.cdum.mlentertainment.util.extensions.*
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment :
    Fragment(R.layout.fragment_home),
    CategoryItemsAdapter.OnItemClickListener {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val homeViewModel: HomeViewModel by viewModels()
    private val categoryItemsViewModel: CategoryItemsViewModel by viewModels()

    private lateinit var homeCategoryAdapter: HomeCategoryAdapter
    private lateinit var categoryItemsAdapter: CategoryItemsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        setupListener()
        initObservers()
    }

    private fun setupView() {
        homeCategoryAdapter = HomeCategoryAdapter()
        categoryItemsAdapter = CategoryItemsAdapter(this@HomeFragment)

        binding.apply {
            rvCategory.apply {
                adapter = homeCategoryAdapter
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            }

            rvItems.apply {
                adapter = categoryItemsAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }

        homeViewModel.getCategoryData()
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
        homeViewModel.liveData.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Error -> showErrorCategories(result.error)
                is Resource.Loading -> showLoadingCategories()
                is Resource.Success -> showSuccessCategories(result.data)
            }
        }

        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            homeViewModel.event.collect { event ->
                when (event) {
                    is HomeEvent.NavigateToCategoryItems -> {
                        val action =
                            HomeFragmentDirections.actionHomeFragmentToCategoryItemsFragment(
                                searchCriteria = event.searchCriteria
                            )
                        findNavController().navigate(action)
                    }
                }
            }
        }

        categoryItemsViewModel.liveData.observe(viewLifecycleOwner) { result ->
            when (result) {
                is Resource.Error -> showErrorItems(result.error)
                is Resource.Loading -> showLoadingItems()
                is Resource.Success -> showSuccessItems(result.data)
            }
        }

        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            categoryItemsViewModel.event.collect { event ->
                val action: NavDirections = when (event) {
                    is CategoryItemsEvent.NavigateToItemDetail -> {
                        HomeFragmentDirections.actionHomeFragmentToCategoryItemDetailFragment(
                            id = event.id
                        )
                    }
                    is CategoryItemsEvent.NavigateToCategoryItems -> {
                        HomeFragmentDirections.actionHomeFragmentToCategoryItemsFragment(
                            searchCriteria = event.searchCriteria
                        )
                    }
                }

                findNavController().navigate(action)
            }
        }
    }

    private fun showErrorCategories(error: Throwable?) {
        goToApiServiceErrorFragment()
    }

    private fun showLoadingCategories() {
        binding.progressBar.visible()
    }

    private fun showSuccessCategories(data: HomeCategoriesData?) {
        binding.apply {
            tvTitle.text = data!!.name

            Glide.with(this@HomeFragment)
                .load(data!!.picture)
                .into(imageView)

            homeCategoryAdapter.submitList(data.children_categories)

            categoryItemsViewModel.getCategoryItemsData()
        }
    }

    private fun showErrorItems(error: Throwable?) {
        goToApiServiceErrorFragment()
    }

    private fun showLoadingItems() {

    }

    private fun goToApiServiceErrorFragment() {
        binding.progressBar.gone()

        val action = HomeFragmentDirections.actionHomeFragmentToApiServiceErrorFragment(
            exitApplication = true
        )
        findNavController().navigate(action)
    }

    private fun showSuccessItems(data: CategoryItemsData?) {
        binding.apply {
            progressBar.gone()
            categoryItemsAdapter.submitList(data?.results)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(result: CategoryResult) {
        categoryItemsViewModel.onItemSelected(result.id!!)
    }
}