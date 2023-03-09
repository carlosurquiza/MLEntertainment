package cl.cdum.mlentertainment.data.model.homeCategories

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "homeCategoriesDataTable")
data class HomeCategoriesData(
    @PrimaryKey val id: String,
    @SerializedName("attributable")
    val attributable: Boolean? = null,
    @SerializedName("attribute_types")
    val attribute_types: String? = null,
    @SerializedName("channels_settings")
    val channels_settings: List<ChannelsSetting>? = null,
    @SerializedName("children_categories")
    val children_categories: List<ChildrenCategory>? = null,
    @SerializedName("date_created")
    val date_created: String? = null,
    @SerializedName("meta_categ_id")
    val meta_categ_id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("path_from_root")
    val path_from_root: List<PathFromRoot>? = null,
    @SerializedName("permalink")
    val permalink: String? = null,
    @SerializedName("picture")
    val picture: String? = null,
    @SerializedName("settings")
    val settings: SettingsX? = null,
    @SerializedName("total_items_in_this_category")
    val total_items_in_this_category: Int? = null
)