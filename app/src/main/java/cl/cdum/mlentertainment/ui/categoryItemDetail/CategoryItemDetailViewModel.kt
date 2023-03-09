package cl.cdum.mlentertainment.ui.categoryItemDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.cdum.ccladevelopers.util.Resource
import cl.cdum.mlentertainment.data.model.categoryItemDetail.CategoryItemDetailData
import cl.cdum.mlentertainment.data.repository.categoryItemDetail.CategoryItemDetailRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryItemDetailViewModel @Inject constructor(private val repository: CategoryItemDetailRepository) :
    ViewModel() {

    private val mutableLiveData = MutableLiveData<Resource<CategoryItemDetailData>>()
    val liveData: LiveData<Resource<CategoryItemDetailData>> = mutableLiveData

    fun getCategoryItemDetail(id: String) =
        viewModelScope.launch {
            repository.getCategoryItemDetail(id).collect {
                mutableLiveData.value = it
            }
        }

    fun getPercentage(totalValue: Long, resultValue: Long): Long {
        return 100 - (resultValue * 100) / totalValue
    }
}