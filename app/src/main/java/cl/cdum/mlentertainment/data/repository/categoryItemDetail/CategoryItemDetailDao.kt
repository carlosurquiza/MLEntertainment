package cl.cdum.mlentertainment.data.repository.categoryItemDetail

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cl.cdum.mlentertainment.data.model.categoryItemDetail.CategoryItemDetailData
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryItemDetailDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategoryItemDetail(categoryItemDetailData: CategoryItemDetailData)

    @Query("SELECT * FROM categoryItemDetailDataTable")
    fun getCategoryItemDetail(): Flow<CategoryItemDetailData>

    @Query("DELETE FROM categoryItemDetailDataTable")
    suspend fun deleteCategoryItemDetail()
}