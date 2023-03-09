package cl.cdum.mlentertainment.ui.categoryItems

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.cdum.ccladevelopers.util.Resource
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryItemsData
import cl.cdum.mlentertainment.data.repository.categoryItems.CategoryItemsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryItemsViewModel @Inject constructor(private val repository: CategoryItemsRepository) :
    ViewModel() {

    private val mutableLiveData = MutableLiveData<Resource<CategoryItemsData>>()
    val liveData: LiveData<Resource<CategoryItemsData>> = mutableLiveData

    fun getCategoryItemsData() =
        viewModelScope.launch {
            repository.getCategoryItemsData().collect {
                mutableLiveData.value = it
            }
        }

    fun getCategoryItemsSearch(searchCriteria: String) =
        viewModelScope.launch {
            repository.getCategoryItemsSearch(searchCriteria).collect {
                mutableLiveData.value = it
            }
        }

    private val eventChannel = Channel<CategoryItemsEvent>()
    val event = eventChannel.receiveAsFlow()

    fun onItemSelected(id: String) = viewModelScope.launch {
        eventChannel.send(CategoryItemsEvent.NavigateToItemDetail(id))
    }

    fun onSearch(searchCriteria: String) = viewModelScope.launch {
        eventChannel.send(CategoryItemsEvent.NavigateToCategoryItems(searchCriteria))
    }
}