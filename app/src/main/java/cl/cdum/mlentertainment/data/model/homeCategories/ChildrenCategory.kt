package cl.cdum.mlentertainment.data.model.homeCategories

import com.google.gson.annotations.SerializedName

data class ChildrenCategory(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("total_items_in_this_category")
    val total_items_in_this_category: Int? = null
)