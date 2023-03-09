package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class Neighborhood(
    @SerializedName("id")
    val neighborhoodId: String? = null,
    @SerializedName("name")
    val name: String? = null
)