package cl.cdum.mlentertainment.data.repository.home

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.cdum.mlentertainment.data.model.homeCategories.HomeCategoriesData
import kotlinx.coroutines.flow.Flow

@Dao
interface HomeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategoryData(categoryItemsData: HomeCategoriesData)

    @Query("SELECT * FROM homeCategoriesDataTable")
    fun getCategoryData(): Flow<HomeCategoriesData>

    @Query("DELETE FROM homeCategoriesDataTable")
    suspend fun deleteCategoryData()
}