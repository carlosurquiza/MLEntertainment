package cl.cdum.mlentertainment.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.cdum.ccladevelopers.util.Resource
import cl.cdum.mlentertainment.data.model.homeCategories.HomeCategoriesData
import cl.cdum.mlentertainment.data.repository.home.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) :
    ViewModel() {

    private val mutableLiveData = MutableLiveData<Resource<HomeCategoriesData>>()
    val liveData: LiveData<Resource<HomeCategoriesData>> = mutableLiveData

    fun getCategoryData() =
        viewModelScope.launch {
            repository.getCategoryData().collect {
                mutableLiveData.value = it
            }
        }

    private val eventChannel = Channel<HomeEvent>()
    val event = eventChannel.receiveAsFlow()

//    fun onSearch(searchCriteria: String) = viewModelScope.launch {
//        eventChannel.send(HomeEvent.NavigateToCategoryItems(searchCriteria))
//    }
}