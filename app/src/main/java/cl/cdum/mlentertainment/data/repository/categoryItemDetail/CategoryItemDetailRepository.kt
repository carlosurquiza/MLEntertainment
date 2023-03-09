package cl.cdum.mlentertainment.data.repository.categoryItemDetail

import androidx.room.withTransaction
import cl.cdum.mlentertainment.util.networkBoundResource
import cl.cdum.mlentertainment.api.ApiService
import cl.cdum.mlentertainment.data.AppDatabase
import javax.inject.Inject

class CategoryItemDetailRepository @Inject constructor(
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) {
    private val categoryItemDetailDao = appDatabase.categoryItemDetailDao()

    fun getCategoryItemDetail(id: String) = networkBoundResource(
        databaseQuery = {
            categoryItemDetailDao.getCategoryItemDetail()
        },
        networkCall = {
            apiService.getCategoryItemDetail(id)
        },
        saveCallResult = {
            appDatabase.withTransaction {
                categoryItemDetailDao.deleteCategoryItemDetail()
                categoryItemDetailDao.insertCategoryItemDetail(it)
            }
        }
    )
}