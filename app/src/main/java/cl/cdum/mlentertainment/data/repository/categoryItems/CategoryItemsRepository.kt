package cl.cdum.mlentertainment.data.repository.categoryItems

import androidx.room.withTransaction
import cl.cdum.mlentertainment.util.networkBoundResource
import cl.cdum.mlentertainment.api.ApiService
import cl.cdum.mlentertainment.data.AppDatabase
import cl.cdum.mlentertainment.util.CATEGORY_ID
import javax.inject.Inject

class CategoryItemsRepository @Inject constructor(
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) {
    private val categoryItemsDao = appDatabase.categoryItemsDao()

    fun getCategoryItemsData() = networkBoundResource(
        databaseQuery = {
            categoryItemsDao.getCategoryItemsData()
        },
        networkCall = {
            apiService.getCategoryItems(CATEGORY_ID)
        },
        saveCallResult = {
            appDatabase.withTransaction {
                categoryItemsDao.deleteCategoryItemsData()
                categoryItemsDao.insertCategoryItemsData(it)
            }
        }
    )

    fun getCategoryItemsSearch(searchCriteria: String) = networkBoundResource(
        databaseQuery = {
            categoryItemsDao.getCategoryItemsData()
        },
        networkCall = {
            apiService.getCategoryItemsSearch(searchCriteria)
        },
        saveCallResult = {
            appDatabase.withTransaction {
                categoryItemsDao.deleteCategoryItemsData()
                categoryItemsDao.insertCategoryItemsData(it)
            }
        }
    )
}