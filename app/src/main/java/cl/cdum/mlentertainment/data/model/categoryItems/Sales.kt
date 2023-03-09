package cl.cdum.mlentertainment.data.model.categoryItems

import com.google.gson.annotations.SerializedName

data class Sales(
    @SerializedName("completed")
    val completed: Int? = null,
    @SerializedName("period")
    val period: String? = null
)