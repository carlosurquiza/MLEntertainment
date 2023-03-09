package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Sort(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)