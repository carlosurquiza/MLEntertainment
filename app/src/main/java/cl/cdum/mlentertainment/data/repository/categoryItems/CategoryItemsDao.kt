package cl.cdum.mlentertainment.data.repository.categoryItems

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryItemsData
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryResult
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryItemsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategoryItemsData(categoryItemsData: CategoryItemsData)

    @Query("SELECT * FROM categoryItemsDataTable")
    fun getCategoryItemsData(): Flow<CategoryItemsData>

    @Query("DELETE FROM categoryItemsDataTable")
    suspend fun deleteCategoryItemsData()
}