package cl.cdum.mlentertainment.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import cl.cdum.mlentertainment.data.model.categoryItemDetail.CategoryItemDetailData
import cl.cdum.mlentertainment.util.Converters
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryItemsData
import cl.cdum.mlentertainment.data.model.homeCategories.HomeCategoriesData
import cl.cdum.mlentertainment.data.repository.categoryItemDetail.CategoryItemDetailDao
import cl.cdum.mlentertainment.data.repository.categoryItems.CategoryItemsDao
import cl.cdum.mlentertainment.data.repository.home.HomeDao

@Database(
    entities = [
        HomeCategoriesData::class,
        CategoryItemsData::class,
        CategoryItemDetailData::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun homeDao(): HomeDao
    abstract fun categoryItemsDao(): CategoryItemsDao
    abstract fun categoryItemDetailDao(): CategoryItemDetailDao
}