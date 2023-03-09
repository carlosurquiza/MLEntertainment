package cl.cdum.mlentertainment.data.model.categoryItemDetail

import com.google.gson.annotations.SerializedName

data class SearchLocation(
    @SerializedName("city")
    val city: CityX? = null,
    @SerializedName("neighborhood")
    val neighborhood: Neighborhood? = null,
    @SerializedName("state")
    val state: StateX? = null
)