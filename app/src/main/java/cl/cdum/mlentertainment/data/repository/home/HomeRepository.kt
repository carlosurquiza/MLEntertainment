package cl.cdum.mlentertainment.data.repository.home

import androidx.room.withTransaction
import cl.cdum.mlentertainment.api.ApiService
import cl.cdum.mlentertainment.data.AppDatabase
import cl.cdum.mlentertainment.util.CATEGORY_ID
import cl.cdum.mlentertainment.util.networkBoundResource
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) {
    private val homeDao = appDatabase.homeDao()

    fun getCategoryData() = networkBoundResource(
        databaseQuery = {
            homeDao.getCategoryData()
        },
        networkCall = {
            apiService.getCategoryData(CATEGORY_ID)
        },
        saveCallResult = {
            appDatabase.withTransaction {
                homeDao.deleteCategoryData()
                homeDao.insertCategoryData(it)
            }
        }
    )
}