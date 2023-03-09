package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class AvailableSort(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null
)