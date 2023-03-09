package cl.cdum.mlentertainment.data.model.categoryItems

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "categoryItemsDataTable")
data class CategoryItemsData(
    @PrimaryKey val id: Int,
    @SerializedName("available_filters")
    val available_filters: List<AvailableFilter>? = null,
    @SerializedName("available_sorts")
    val available_sorts: List<AvailableSort>? = null,
    @SerializedName("country_default_time_zone")
    val country_default_time_zone: String? = null,
    @SerializedName("filters")
    val filters: List<Filter>? = null,
    @SerializedName("paging")
    val paging: Paging? = null,
    @SerializedName("results")
    val results: List<CategoryResult>? = null,
    @SerializedName("site_id")
    val site_id: String? = null,
    @SerializedName("sort")
    val sort: Sort? = null
)